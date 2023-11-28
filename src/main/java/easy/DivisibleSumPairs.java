package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DivisibleSumPairs {


    public static void main(String[] args) {


        List<Integer> ar = new ArrayList<>(Arrays.asList(1, 3, 2, 6, 1, 2));

        System.out.println(divisibleSumPairs(0, 3, ar));
        System.out.println(divisibleSumPairs2(0, 3, ar));
        System.out.println(divisibleSumPairs3(0, 3, ar));


    }


    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        // Write your code here
        List<List<Integer>> duplasList = new ArrayList<>();

        for (int i = 0; i < ar.size() - 1; i++) {
            for (int j = i + 1; j < ar.size(); j++) {
                //System.out.println(ar.get(i)+","+ar.get(j));
                List<Integer> dupla = new ArrayList<>();

                dupla.add(ar.get(i));
                dupla.add(ar.get(j));

                Collections.sort(dupla);
                boolean duplicate = false;

                for (List<Integer> list : duplasList) {
                    if (list.equals(dupla)) {
                        duplicate = true;
                        break;
                    }
                }

                System.out.println(((dupla.get(0) + dupla.get(1)) % k));

                if (!duplicate) {

                    if (((dupla.get(0) + dupla.get(1)) % k == 0)) {
                        duplasList.add(dupla);
                    }
                }

            }
        }
        System.out.println(Arrays.toString(new List[]{duplasList}));

        return duplasList.size();
    }

    public static int divisibleSumPairs2(int n, int k, List<Integer> ar) {
        // Write your code here
        List<List<Integer>> duplasList = new ArrayList<>();

        for (int i = 0; i < ar.size() - 1; i++) {
            for (int j = i + 1; j < ar.size(); j++) {

                List<Integer> dupla = new ArrayList<>();

                dupla.add(ar.get(i));
                dupla.add(ar.get(j));

                Collections.sort(dupla);


                if (((dupla.get(0) + dupla.get(1)) % k == 0)) {
                    duplasList.add(dupla);
                }


            }
        }

        return duplasList.size();
    }

    public static int divisibleSumPairs3(int n, int k, List<Integer> ar) {
        // Write your code here
        int duplaCount = 0;
        for (int i = 0; i < ar.size() - 1; i++) {
            for (int j = i + 1; j < ar.size(); j++) {

                if (((ar.get(i) + ar.get(j)) % k == 0)) {
                    duplaCount++;
                }

            }
        }
        return duplaCount;
    }
}
