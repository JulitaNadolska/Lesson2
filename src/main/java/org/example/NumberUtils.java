package org.example;
import java.util.Random;

public class NumberUtils {
    private Random r = new Random();

    public void printCharToken() {
        char random_Char = (char) (33 + r.nextInt(126));
        System.out.print(random_Char);
    }
}