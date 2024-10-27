package com.codeclaude.project1;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculating = true;

        System.out.println("=======================================");
        System.out.println("       WELCOME TO JAVA CALCULATOR      ");
        System.out.println("=======================================");

        while (continueCalculating) {
            System.out.println("\nChoose an operation:");
            System.out.println("[1] ➕ Addition");
            System.out.println("[2] ➖ Subtraction");
            System.out.println("[3] ✖️ Multiplication");
            System.out.println("[4] ➗ Division");
            System.out.print("Enter your choice (1-4): ");
            
            int choice = scanner.nextInt();

            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            double result = 0;
            boolean validChoice = true;
            String operation = "";

            switch (choice) {
                case 1:
                    result = num1 + num2;
                    operation = "+";
                    break;
                case 2:
                    result = num1 - num2;
                    operation = "-";
                    break;
                case 3:
                    result = num1 * num2;
                    operation = "*";
                    break;
                case 4:
                    if (num2 != 0) {
                        result = num1 / num2;
                        operation = "/";
                    } else {
                        System.out.println("Error: Division by zero is not allowed!");
                        validChoice = false;
                    }
                    break;
                default:
                    System.out.println("Invalid choice! Please select a valid operation.");
                    validChoice = false;
            }

            if (validChoice) {
                System.out.printf("\nResult: %.2f %s %.2f = %.2f\n", num1, operation, num2, result);
                System.out.println("---------------------------------------");
            }

            System.out.print("\nWould you like to perform another calculation? (y/n): ");
            String continueResponse = scanner.next().trim().toLowerCase();
            continueCalculating = continueResponse.equals("y");
        }

        System.out.println("\nThank you for using the Java Calculator!");
        System.out.println("=======================================");
        
        scanner.close();
    }
}

