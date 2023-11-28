package CodeWars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PangramChecker {


    //A pangram is a sentence that contains every single letter of the alphabet at least once. For example,
    // the sentence "The quick brown fox jumps over the lazy dog" is a pangram, because it uses the letters A-Z
    // at least once (case is irrelevant).
    //
    //Given a string, detect whether or not it is a pangram. Return True if it is, False if not. Ignore numbers and punctuation.

    public static void main(String[] args) {

        System.out.println(check("Hello"));
        System.out.println(check("The quick brown fox jumps over the lazy dog."));
    }

    static boolean check(String sentence){
        // Create a list to store the alphabet
        List<String> alphabetList = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"));

        // Compare each element of alphabehtList with the setence
        for (String letter : alphabetList) {
            if (!sentence.toLowerCase().replaceAll(" ","").contains(letter))
                return false;
        }

        return true;
    }
}
