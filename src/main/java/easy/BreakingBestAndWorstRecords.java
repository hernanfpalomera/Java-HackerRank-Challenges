package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BreakingBestAndWorstRecords {

    /*
     * Complete the 'breakingRecords' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY scores as parameter.
     */

    public static void main(String[] args) {

        List<Integer> scores = new ArrayList<>(Arrays.asList(10, 5, 20, 20, 4, 5, 2, 25, 1));

        breakingRecords(scores);
    }


    public static List<Integer> breakingRecords(List<Integer> scores) {
        // Write your code here
        Integer highestScore = scores.get(0);
        Integer lowestScore = scores.get(0);

        List<Integer> bestAndWorstRecords = new ArrayList<>(Arrays.asList(0,0));
        for (Integer score: scores) {

            if (score > highestScore) {
                bestAndWorstRecords.set(0, bestAndWorstRecords.get(0) + 1);
                highestScore = score;
            } else if ((score < lowestScore)) {
                bestAndWorstRecords.set(1, bestAndWorstRecords.get(1) + 1);

                lowestScore = score;
            }
        }
        return bestAndWorstRecords;
    }
}
