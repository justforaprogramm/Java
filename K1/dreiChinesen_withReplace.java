public class drei_chinesen
{
    public drei_chinesen()
    {
        String DC = "Drei Chinesen mit dem Kontrabass saßen auf der Straße und erzählten sich was, da kam die Polizei, ja was ist den das? Drei Chinesen mit dem Kontrabass.";
        DC = isDoubled(DC);
        String[] Vokals = {"a","e","i","o","u","au"};
        
        for(String Vokal:Vokals)
        {
            System.out.println(replaceMultipleVocal(DC, Vokal));
        }
    }

    public String replaceMultipleVocal(String str, String reStr)
    {
        return str.replaceAll("[aeiouAEIOU]", reStr);
    }

    public boolean isVocal(char ch)
    {
        return "AEIOUÄÖÜaeiouäöü".indexOf(ch) != -1;
    }

    public String isDoubled(String str) 
    {
        char[] charArray = str.toCharArray();
        char previousChar = charArray[0];
        StringBuilder result = new StringBuilder();
        
        for (char ch: charArray) 
        {
            if (isVocal(previousChar) && isVocal(ch))
            {
                continue;
            }
            result.append(ch);
            previousChar = ch;
        }
        return result.toString();
    }
}
