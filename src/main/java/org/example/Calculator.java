package org.example;

import java.util.Scanner;

public class Calculator
{
    public static void calculator()
    {
        Scanner scan = new Scanner(System.in);

        // Display the menu
        System.out.println("Simple Calculator");
        System.out.println("Select operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter choice (1/2/3/4): ");
        int choice = scan.nextInt();

        System.out.print("Enter first number: ");
        double num1 = scan.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scan.nextDouble();

        double result;
        switch (choice)
        {
            case 1:
                result = add(num1, num2);
                System.out.println("Result: " + result);
                break;
            case 2:
                result = subtract(num1, num2);
                System.out.println("Result: " + result);
                break;
            case 3:
                result = multiply(num1, num2);
                System.out.println("Result: " + result);
                break;
            case 4:
                if (num2 != 0)
                {
                    result = divide(num1, num2);
                    System.out.println("Result: " + result);
                }
                else
                {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
    private static double add(double a, double b)
    {
        return a + b;
    }

    private static double subtract(double a, double b)
    {
        return a - b;
    }

    private static double multiply(double a, double b)
    {
        return a * b;
    }

    private static double divide(double a, double b)
    {
        return a / b;
    }
}
