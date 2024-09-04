package org.example;

import java.util.Scanner;

public class Calculatedigits
{
    public static void calculatedigits()
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Input the number to sum: ");
        int n = scan.nextInt();
        int sum = digits(n);

        System.out.println("The sum of the digits is " + sum);
    }
    private static int digits(int number)
    {
        int sum = 0;
        do
        {
            sum += number % 10;
            number /= 10;
        }
        while(number !=0);

        return sum;
    }
}
