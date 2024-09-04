package org.example;

import java.util.Scanner;

public class Largestelement
{
    public static void largestNumber()
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Input the number of elements in the array: ");
        int n = scan.nextInt();

        int[] a = new int[n];

        System.out.println("Input " + n + " numbers to see the largest number: ");

        for (int i = 0 ; i < n ; i++)
        {
            a[i] = scan.nextInt();
        }
        int max = Largestelement.largestElement(a);

        System.out.println("The largest number is: " + max);
    }

    private static int largestElement(int[] array)
    {
        int max = array[0];

        for (int i = 1 ; i < array.length ; i++)
        {
            if (array[i] > max)
            {
                max = array[i];
            }
        }
        return max;
    }
}