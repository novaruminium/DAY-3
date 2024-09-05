package org.example;

import java.util.Scanner;

public class Reverse
{
    public static void reverse()
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word to reverse:");
        String input = scan.nextLine(); // Read the input string

        String reversed = reverseString(input);

        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reversed);

        scan.close();
    }
    private static String reverseString(String str)
    {
        char[] charArray = str.toCharArray();

        int left = 0;
        int right = charArray.length - 1;

        while (left < right)
        {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            left++;
            right--;
        }
        return new String(charArray);
    }
}
