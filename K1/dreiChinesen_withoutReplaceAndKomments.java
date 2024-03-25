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
        char[] charArray = str.toCharArray();
        StringBuilder result = new StringBuilder();
        for (char ch:charArray) 
        {
            if ("AEIOUÄÖÜaeiouäöü".indexOf(ch) != -1)
            {
                result.append(reStr);
            }
            else
            {
                result.append(ch);
            }
        }
        return result.toString();
    }

    private String isDoubled(String str) 
    {
        char[] charArray = str.toCharArray();
        char prevChar = charArray[0];
        StringBuilder result = new StringBuilder();
        for (char ch:charArray) 
        {
            if(!("AEIOUÄÖÜaeiouäöü".indexOf(prevChar) != -1 & "AEIOUÄÖÜaeiouäöü".indexOf(ch) != -1))
            {
                result.append(ch);
            }
            prevChar = ch;
        }
        return result.toString();
    }
}
