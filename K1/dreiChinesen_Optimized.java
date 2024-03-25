public class drei_chinesen
{
    public drei_chinesen()
    {
        String DC = "Drei Chinesen mit dem Kontrabass saßen auf der Straße und erzählten sich was, da kam die Polizei, ja was ist den das? Drei Chinesen mit dem Kontrabass.";
        String[] Vokals = {"a","e","i","o","u","au"};
        
        StringBuilder result = new StringBuilder();
        for(String Vokal:Vokals)
        {
            result.append(replaceMultipleVocal(isDoubled(DC), Vokal) + "\n");
        }
        System.out.print(result.toString());
    }

    private String replaceMultipleVocal(String str, String reStr)
    {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < str.length(); i++) 
        {
            if ("aeiouäöü".indexOf(str.charAt(i)) != -1)
            {
                result.append(reStr);
            }
            else if("AEIOUÄÖÜ".indexOf(str.charAt(i)) != -1)
            {
                result.append(reStr.toUpperCase());
            }
            else
            {
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }

    private String isDoubled(String str) 
    {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < str.length()-1; i++) 
        {
            if(!("AEIOUÄÖÜaeiouäöü".indexOf(str.charAt(i)) != -1 & "AEIOUÄÖÜaeiouäöü".indexOf(str.charAt(i+1)) != -1))
            {
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }
}
