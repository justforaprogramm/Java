/**
 * Beschreiben Sie hier die Klasse drei_chinesen.
 * 
 * @author Benjamin Schmid
 * @version 03.03.2024
 */
public class drei_chinesen
{
    private String DC;
    char DCA_t[];
    public drei_chinesen()
    {
        DC = "Drei Chinesen mit dem Kontrabass saßen auf der Straße und erzählten sich was, da kam die Polizei, ja was ist den das? Drei Chinesen mit dem Kontrabass.";
        
        DCA_t = StringToArray(DC);
        printCharArray(DCA_t);
        
        //System.out.println("\n" + VocalNumber(DC) + "\n");
        
        DC = replaceVocal(DC, 'a');
        
        DC = isDoubled(DC);
        
        DCA_t = StringToArray(DC);
        printCharArray(DCA_t);
        
        DC = replaceVocal(DC, 'e');
        
        DCA_t = StringToArray(DC);
        printCharArray(DCA_t);
        
        DC = replaceVocal(DC, 'i');
        
        DCA_t = StringToArray(DC);
        printCharArray(DCA_t);
        
        DC = replaceVocal(DC, 'o');
        
        DCA_t = StringToArray(DC);
        printCharArray(DCA_t);
        
        DC = replaceVocal(DC, 'u');
        
        DCA_t = StringToArray(DC);
        printCharArray(DCA_t);
        
        DC = replaceMultipleVocal(DC, "au");
        
        DCA_t = StringToArray(DC);
        printCharArray(DCA_t);
        
        //if more than one replaced vokal
        DC = isDoubled(DC);
        
    }
    
    /**
     * prints an Array of chars
     * 
     * @param         char[] chA
     * @return        void
     */
    public void printCharArray(char[] chA)
    {
        for(char c: chA) System.out.print(c);
        System.out.println();
    }

    /**
     * Use given String to make it a char Array
     * 
     * @param         String DC
     * @return        char[]
     */
    public char[] StringToArray(String str)
    {
        char[] charA_t = str.toCharArray();
        return charA_t;
    }
    
    /**
     * checks if given char is a Vokal
     * 
     * @param         char ch
     * @return        boolean
     */
    public boolean isVocal(char ch)
    {
        return "AEIOUaeiouäöüÄÖÜ".indexOf(ch) != -1;
    }
    
    /**
     * return how many vokals are in a CharArray
     * 
     * @param         char[] chA
     * @return        int
     */
    public int VocalNumber(String str)
    {
        int number = 0;
        
        char[] chA = StringToArray(str);
        for(char c: chA)if(true == isVocal(c))number ++;
        
        return number;
    }
    
    /**
     * replace all Vokals in a String, with an given char
     * 
     * @param         String str
     * @param         char c
     * @return        int
     */
    public String replaceVocal(String str, char cR)
    {
        char[] chA = StringToArray(str);
        for(int c=0; c < chA.length -1; c++)if(true == isVocal(chA[c])) chA[c] = cR;
        return charToString(chA);
    }
    
    /**
     * replace all Vokals in a String, with an multiple given char
     * 
     * @param         String str
     * @param         String c
     * @return        int
     */
    public String replaceMultipleVocal(String str, String cR)
    {
        return str.replaceAll("[aeiouAEIOUs]", cR);
    }
    
    /**
     * replace all Vokals in a String, with an given char
     * 
     * @param         String str
     * @param         char c
     * @return        int
     */
    public String charToString(char[] chA)
    {
        return String.valueOf(chA);
    }
    
    /**
     * remove doubled chars
     * 
     * @param         String str
     * @return        String
     */
    public String isDoubled(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        char[] charArray = StringToArray(input);
        char previousChar = charArray[0];
        StringBuilder resultBuilder = new StringBuilder();
        resultBuilder.append(previousChar);

        for (int i = 1; i < charArray.length; i++) {
            char currentChar = charArray[i];

            if (isVocal(previousChar) && isVocal(currentChar) && previousChar == currentChar) {
                continue;
            }

            resultBuilder.append(currentChar);
            previousChar = currentChar;
        }

        return resultBuilder.toString();
    }
}