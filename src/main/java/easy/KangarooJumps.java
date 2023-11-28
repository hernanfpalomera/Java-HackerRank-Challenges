package easy;

public class KangarooJumps {


    public static void main(String[] args) {

        int x1 = 0;
        int v1 = 3;
        int x2 = 4;
        int v2 = 2;

        System.out.println(kangaroo(x1, v1, x2, v2));

    }

    /*
     * Complete the 'kangaroo' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER x1
     *  2. INTEGER v1
     *  3. INTEGER x2
     *  4. INTEGER v2
     */

    public static String kangaroo(int x1, int v1, int x2, int v2) {
        // Write your code here

        String arrivesAtSameLocation = "NO";

        int i =0;
        while (i < 10000){

            x1 += v1;
            x2 += v2;

            //System.out.println(String.format("Kangaroo 1 location on meters: %d",x1));
            //System.out.println(String.format("Kangaroo 2 location on meters: %d",x2));

            if (x1 ==x2) {
                arrivesAtSameLocation = "YES";
                break;
            }
            i++;
        }

        return arrivesAtSameLocation;
    }
}
