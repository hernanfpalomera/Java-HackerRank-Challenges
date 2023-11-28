package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompareTheTriplets {


    public static void main(String[] args) {
        List<Integer> aliceTriplet = new ArrayList<Integer>() {
            {
                add(5);
                add(6);
                add(7);
            } };

        List<Integer> bobTriplet = new ArrayList<Integer>() {
            {
                add(3);
                add(6);
                add(10);
            } };

        compareTriplets(aliceTriplet, bobTriplet);
    }

    public static List<Integer> compareTriplets(List<Integer> aTriplet, List<Integer> bTriplet) {

        List<Integer> pointsList = new ArrayList();

        pointsList.add(0);
        pointsList.add(0);

        for (int i = 0; i < aTriplet.size(); i++) {

            System.out.println("aTriplet.get(i) value: "
                    .concat(aTriplet.get(i).toString())
                    .concat(" bTriplet.get(i) value: ")
                    .concat(bTriplet.get(i).toString())
            );

            if (aTriplet.get(i) > bTriplet.get(i)) {
                System.out.println("aTriplet is grather");
                pointsList.set(0, pointsList.get(0) + 1);
            } else if (aTriplet.get(i) < bTriplet.get(i)) {
                System.out.println("bTriplet is grather");
                pointsList.set(1, pointsList.get(1) + 1);
            }

        }

        return pointsList;
    }
}
