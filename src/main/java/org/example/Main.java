package org.example;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Specify how many characters token you want to generate: ");
            Random r = new Random();

            class RandomNumber {
                public static void token() {
                    Random r = new Random();
                    char random_Char = (char) (33 + r.nextInt(126));
                    ArrayList randomNumbers = new ArrayList();
                    randomNumbers.add(random_Char);

                    for (Object token : randomNumbers) {
                        System.out.print(token.toString());
                    }
                }
            }
            Scanner scanner = new Scanner(System.in);
            int enteredNumber = scanner.nextInt();

            if (enteredNumber == 5) {
                System.out.print("Your 5 characters token is: ");
                for (char i = 0; i < 5; i++) {
                    RandomNumber.token();
                }
            } else if (enteredNumber == 10) {
                System.out.print("Your 10 characters token is: ");
                for (char i = 0; i < 10; i++) {
                    RandomNumber.token();
                }
            } else if (enteredNumber == 15) {
                System.out.print("Your 15 characters token is: ");
                for (char i = 0; i < 15; i++) {
                    RandomNumber.token();
                }
            } else {
                System.out.print("Provided wrong number! This token generator is only able to generate a 5, 10 or 15 character token. ");
            }
        }
    }
}