package CodeWars;

import java.util.Arrays;

public class MorseCodeDecoder {


    public static void main(String[] args) {

        // Morse code by indexing
        String[] morseCodeList
                = { ".-",   "-...", "-.-.", "-..",  ".",
                "..-.", "--.",  "....", "..",   ".---",
                "-.-",  ".-..", "--",   "-.",   "---",
                ".--.", "--.-", ".-.",  "...",  "-",
                "..-",  "...-", ".--",  "-..-", "-.--",
                "--..", "|" };

        String morseCode = ".... . -.--   .--- ..- -.. .";

        //System.out.print((char)(1 + 'a') + " ");

        morseToEnglish(morseCodeList, morseCode);
    }



    public static void morseToEnglish(String[] morseCodeList,
                                      String morseCode)
    {
        String[] morseCodeSplit = morseCode.split(" ");
        System.out.println("Morse code " + morseCode + " to English is ");

        System.out.println(Arrays.toString(morseCodeSplit));

        // Morse code to English

        StringBuilder str = new StringBuilder();
        for (int i = 0; i < morseCodeSplit.length; i++) {

           if (morseCodeSplit[i].isEmpty()) {
               str.append(" ");
           }

            for (int j = 0; j < morseCodeList.length; j++) {
                if (morseCodeSplit[i].compareTo(morseCodeList[j]) == 0) {
                    //System.out.print((char)(j + 'a') + " ");
                    str.append((char)(j + 'a'));
                    break;
                }
            }
        }

        System.out.println(str.toString().toUpperCase());
    }
}
