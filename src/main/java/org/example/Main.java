package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumberUtils numUtils = new NumberUtils();
        boolean newAttempt = true;

        System.out.println("------PROGRAM START--------");

        while (newAttempt) {
            System.out.println("Specify how many character token you want to generate: ");
            int enteredNumber = scanner.nextInt();

            if (enteredNumber == 5) {
                System.out.print("Your 5 characters token is: ");
                for (char i = 0; i < 5; i++) {
                    numUtils.printCharToken();
                }
            } else if (enteredNumber == 10) {
                System.out.print("Your 10 characters token is: ");
                for (char i = 0; i < 10; i++) {
                    numUtils.printCharToken();
                }
            } else if (enteredNumber == 15) {
                System.out.print("Your 15 characters token is: ");
                for (char i = 0; i < 15; i++) {
                    numUtils.printCharToken();
                }
            } else {
                System.out.print(
                        "Provided wrong number! This token generator is only able to generate a 5, 10 or 15 character token. ");
                newAttempt = false;
            }
            System.out.println(" ");
            System.out.println("------PROGRAM END--------");
        }

        scanner.close();
    }

}