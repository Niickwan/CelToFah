package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Exercise 2
        double fahrenheit = 0.0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a temperature in celsius: ");
        double celsius = scanner.nextDouble();

        fahrenheit = celsius * 9/5 + 32;
        System.out.printf("%.1f C = %.1f F \n\n", celsius, fahrenheit);
    }
}
