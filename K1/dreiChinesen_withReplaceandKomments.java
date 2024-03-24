/**
 * Beschreiben Sie hier die Klasse drei_chinesen.
 * 
 * @author Benjamin Schmid
 * @version 24.03.2024
 */
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
    
    /**
     * replace all Vokals in a String, with an multiple given char
     * 
     * @param         String str
     * @param         String c
     * @return        int
     */
    public String replaceMultipleVocal(String str, String reStr)
    {
        return str.replaceAll("[aeiou]", reStr);
    }
        
    /**
     * checks if given char is a Vokal
     * 
     * @param         char ch
     * @return        boolean
     */
    public boolean isVocal(char ch)
    {
        return "AEIOUÄÖÜaeiouäöü".indexOf(ch) != -1;
    }
    
    /**
     * remove doubled vokal chars
     * 
     * @param         String str
     * @return        String
     */
    public String isDoubled(String str) 
    {
        //to char Aray
        char[] charArray = str.toCharArray();
        char previousChar = charArray[0];
        // builds string
        StringBuilder result = new StringBuilder();
        //checks if Doubled Vokal
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