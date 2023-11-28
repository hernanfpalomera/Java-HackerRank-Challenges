package CodeWars;

public class RegexValidatePINCode {

   // ATM machines allow 4 or 6 digit PIN codes and PIN codes cannot contain anything but exactly 4 digits or exactly 6 digits.
    //If the function is passed a valid PIN string, return true, else return false.


    public static void main(String[] args) {

        System.out.println(validatePin("1234"));
        System.out.println(validatePin(".234"));
        System.out.println(validatePin("111"));
        System.out.println(validatePin("123 "));
        System.out.println(validatePin("+111"));


    }

    public static boolean validatePin(String pin) {
        return (pin.length() == 4 || pin.length() == 6) && pin.matches("\\d+");    }
}
