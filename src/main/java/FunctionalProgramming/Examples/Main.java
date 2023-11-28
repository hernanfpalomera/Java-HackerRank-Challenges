package FunctionalProgramming.Examples;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers = generateRandomCustomerList();

        List<Integer> numbers = new ArrayList<>();

        numbers = generateRandomNumberList();

        //System.out.println(customers);

        //customers.stream().forEach(System.out::println);



//        numbers.stream()
//                .forEach(System.out::println);
//
//        numbers.stream()
//                .sorted()
//                .forEach(System.out::println);

        numbers.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

    }

    static List<Customer> generateRandomCustomerList(){

        List<Customer> customers = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            String randomName = "Customer" + i;
            String randomEmail = "customer" + i + "@example.com";
            String randomPhoneNumber = "+1" + (1000000000 + random.nextInt(900000000));
            LocalDate randomBirthDate = LocalDate.of(1980 + random.nextInt(30), 1 + random.nextInt(12), 1 + random.nextInt(28));
            customers.add(new Customer(randomName, randomEmail, randomPhoneNumber, randomBirthDate));
        }
        return customers;

    }

    static List<Integer> generateRandomNumberList(){

        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            //Integer randomNumber = (1000000000 + random.nextInt(100000000));
            Integer randomNumber = (1000000000 + random.nextInt(100000000));
            numbers.add(randomNumber);
        }

        return numbers;
    }
}
