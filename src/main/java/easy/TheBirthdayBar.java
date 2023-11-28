package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TheBirthdayBar {


    /*
     * Complete the 'birthday' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY s
     *  2. INTEGER d
     *  3. INTEGER m
     */

    public static void main(String[] args) {

        
        List<Integer> squares = new ArrayList<>(Arrays.asList(1, 2, 1, 3, 2));
        System.out.println(birthday(squares,4,2));
    }


    public static int birthday(List<Integer> s, int d, int m) {
        // Write your code here
        int squareBirthdayCounter = 0;
        for (int i = 0; i < s.size() - (m - 1); i++) {

            //System.out.print(s.get(i) + ",");
            int squareIndex = 0;
            int squareCounter = 0;

            for (int j = i + 1; squareIndex < m - 1; j++) {

                //System.out.print(s.get(j) + ",");

                squareCounter += s.get(j);
                squareIndex++;
            }
            //System.out.println();

            if (s.get(i) + squareCounter == d)
                squareBirthdayCounter++;

            squareCounter = 0;
            squareIndex = 0;
        }

        return squareBirthdayCounter;
    }

}
