package org.nathi.com;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.println("Welcome to the Calculator!");

        // Ask user for the operation
        System.out.print("Enter the operation (add/multiply): ");
        String operation = sc.next();

        // Ask user for the number of values they want to operate on
        System.out.print("How many numbers would you like to " + operation + "? ");
        int count = sc.nextInt();

        // Initialize an array to store numbers
        int[] numbers = new int[count];


        System.out.println("Enter " + count + " numbers:");
        for (int i = 0; i < count; i++) {
            numbers[i] = sc.nextInt();
        }

        if (operation.equalsIgnoreCase("add")) {
            int sum = calc.add(numbers);
            System.out.println("The sum is: " + sum);
        } else if (operation.equalsIgnoreCase("multiply")) {
            int product = calc.multiply(numbers);
            System.out.println("The product is: " + product);
        } else {
            System.out.println("Invalid operation. Please choose either 'add' or 'multiply'.");
        }

        sc.close();  // Close the scanner after use
    }
    }
