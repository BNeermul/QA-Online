package org.example;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a maximum");
        int max = scanner.nextInt();

        for (int i = 1; i < max; i++) {
            System.out.println(FizzBuzz.fizzBuzz(i));
        }

        scanner.close();

    }

}