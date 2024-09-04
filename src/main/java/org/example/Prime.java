package org.example;

import java.util.Scanner;

public class Prime
{
    public static void prime()
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Input the number to check if it is a prime number: ");
        int n = scan.nextInt();

        if (Prime.primenumber(n))
        {
            System.out.println(n+" is a prime number.");
        }
        else
        {
            System.out.println(n+" is not a prime number.");
        }
    }

    private static boolean primenumber(int num)
    {
        if (num <= 1)
        {
            return false;
        }
        for (int i = 2; i <= num / 2; i++)
        {
            if ((num % i) == 0)
            {
                return false;
            }
            return true;
        }
        return false;
    }
}