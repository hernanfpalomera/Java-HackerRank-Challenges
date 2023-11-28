package disney;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {


    public static void main(String[] args) {


        //Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0?
        // Find all unique triplets in the array which gives the sum of zero.
        // Example: Given array nums = [-1, 0, 1, 2, -1, -4] Solution set is: [[-1, 0, 1], [-1, -1, 2] ]

        List<Integer> numbers = new ArrayList<>(Arrays.asList(-1, 0, 1, 2, -1, -4));

        //Size = 6
        System.out.println("numbers size: "+ numbers);

        List<List<Integer>> tripletsList = new ArrayList<>();

        for (int i = 0; i < numbers.size() - 2; i++) {
            for (int j = i + 1; j <  numbers.size() - 1; j++) {
                for (int k = j + 1; k < numbers.size(); k++) {
                    if (numbers.get(i) + numbers.get(j) + numbers.get(k) == 0) {
                        List<Integer> triplet = new ArrayList<>();
                        triplet.add(numbers.get(i));
                        triplet.add(numbers.get(j));
                        triplet.add(numbers.get(k));

                        Collections.sort(triplet);
                        boolean duplicate = false;

                        for (List<Integer> list : tripletsList) {
                            if (list.equals(triplet)) {
                                duplicate = true;
                                break;
                            }
                        }

                        if (!duplicate) {
                            tripletsList.add(triplet);
                        }
                    }
                }
            }
        }

        System.out.println(tripletsList);
    }

}
