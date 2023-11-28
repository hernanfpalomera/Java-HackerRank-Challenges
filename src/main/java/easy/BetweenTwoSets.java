package easy;

import java.util.*;

public class BetweenTwoSets {

    /*
     * Complete the 'getTotalX' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static void main(String[] args) {
        //List<Integer> a = new ArrayList<>(Arrays.asList(2,6));
        //List<Integer> b = new ArrayList<>(Arrays.asList(24,36));


        List<Integer> a = new ArrayList<>(Arrays.asList(2,4));
        List<Integer> b = new ArrayList<>(Arrays.asList(16,32,96));
        getTotalX(a,  b);
    }

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        // Get the greatest number in list a
        int maxA = a.stream().max((num1, num2) -> num1 - num2).get();

        // Get the smallest number in list b
        int minB = b.stream().min((num1, num2) -> num1 - num2).get();

        // Save all possible factors
        Set<Integer> factors = new HashSet<>();

        // Check if current num is a possible factor
        Integer currentNum = 0;

        // Only need to check factors that are less than or equal to the smallest number in list b
        while((currentNum += maxA) <= minB) {
            boolean isFactor = true;
            // If all numbers in list a divide into the curentNum then it is a possible factor
            for(Integer n : a) {
                if(currentNum % n != 0) {
                    isFactor = false;
                    break;
                }
            }
            if(isFactor)
                factors.add(currentNum);
        }

        int factorCount = 0;
        // The factor count is incremented when all numbers in list b are divisible by a factor in the factors set
        for(Integer f : factors) {
            boolean isFactor = true;
            for(Integer bNum : b) {
                if(bNum % f != 0) {
                    isFactor = false;
                    break;
                }
            }
            if(isFactor)
                factorCount++;
        }
        return factorCount;
    }


    public static int getTotalXRefactored(List<Integer> a, List<Integer> b) {
        // Get the greatest number in list a
        int maxA = a.stream().max(Integer::compare).orElse(0);

        // Get the smallest number in list b
        int minB = b.stream().min(Integer::compare).orElse(Integer.MAX_VALUE);

        // Count the factors
        int factorCount = 0;

        // Iterate through the possible factors
        for (int currentNum = maxA; currentNum <= minB; currentNum += maxA) {
            // Check if currentNum is a factor of list a
            int finalCurrentNum = currentNum;
            boolean isFactorOfA = a.stream().allMatch(num -> finalCurrentNum % num == 0);

            // Check if currentNum is a factor of list b
            boolean isFactorOfB = b.stream().allMatch(num -> num % finalCurrentNum == 0);

            if (isFactorOfA && isFactorOfB) {
                factorCount++;
            }
        }

        return factorCount;
    }

}

