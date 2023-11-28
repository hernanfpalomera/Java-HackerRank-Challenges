package CodeWars;

public class RowSumOddNumbers {


//    Given the triangle of consecutive odd numbers:
//
//            1
//            3     5
//            7     9    11
//            13    15    17    19
//            21    23    25    27    29
//            ...
//
//    Calculate the sum of the numbers in the nth row of this triangle (starting at index 1) e.g.: (Input --> Output)
//
//            1 -->  1
//            2 --> 3 + 5 = 8


    public static void main(String[] args) {

        System.out.println(rowSumOddNumbers(42));
        System.out.println(rowSumOddNumbersV2(42));
        System.out.println(rowSumOddNumbersV3(42));


    }

    public static int rowSumOddNumbers(int n) {
        //TODO
       //System.out.print("List of odd numbers from 1 to " + n + ": ");

        int i = 0;
        int rowCounter = 1;
        int oddCounter = 0;
        int oddSum = 0;
        while (rowCounter <= n) {

            if (i % 2 != 0) {
                if(rowCounter == n){
                    //System.out.print(i + " ");
                    oddSum +=i;
                }
                //System.out.print(i + " ");
                oddCounter++;

                if(oddCounter == rowCounter){
                    rowCounter++;
                    oddCounter = 0;
                }
            }
            i++;
        }
        return oddSum;
    }


    public static int rowSumOddNumbersV2(int n) {
        //TODO
        //System.out.print("List of odd numbers from 1 to " + n + ": ");

        int i = 1;
        int rowCounter = 1;
        int oddCounter = 0;
        int oddSum = 0;
        while (rowCounter <= n) {

                if(rowCounter == n){
                    //System.out.print(i + " ");
                    oddSum +=i;
                }
                //System.out.print(i + " ");
                oddCounter++;

                if(oddCounter == rowCounter){
                    rowCounter++;
                    oddCounter = 0;
                }

            i+=2;
        }
        return oddSum;
    }

    public static int rowSumOddNumbersV3(int n) {
    /* sum of consequent M numbers is (M+1)M/2, so
     * we may know how many numbers were below
     * our ROW : numbersBelow = ((n-1)*(n))/2.
     * Now we may calculate first number in row:
     * firstNumberInRow = 2*numbersBelow+1.
     * So, firstNumberInRow = n*n-n+1 and
     * last number in ROW is n*n-n+1 + 2(n-1).
     * Let assume that last number before row is
     * x1 and last number in row is x2. It's known
     * that 1+3+5+...+(2k-1) = k*k.
     * Sum in row must be x2*x2 - x1*x1.
     // OUR x1 = (n*n-n)/2 and x2 = (n*n+n)/2.
     * After some simplification: SUM = n*n*n. */
        return n*n*n;
    }
}

