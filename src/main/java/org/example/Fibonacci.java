package org.example;

import java.util.Scanner;

public class Fibonacci
{
    public static void fibonacciSequence()
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Input the desired number for Fibonacci: ");
        int number = scan.nextInt();

        System.out.println(fibonacci(number));
    }

        private static long fibonacci (int number)
        {
            if (number <= 1)
            {
                return number;
            }
            return (fibonacci(number - 1) + fibonacci(number - 2));
        }
}
