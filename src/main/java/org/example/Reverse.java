package org.example;

import java.util.Scanner;

public class Reverse
{
    public static void reverse()
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Input a word to reverse:");
        String word = scan.nextLine();

        System.out.println("Reversed: " + reverseString(word));

        scan.close();
    }

    //I'm trying to make a method where I can re-arrange the word.
   private static String reverseString(String word)
   {
       //Change the String to character using array.
       char[] charArray = word.toCharArray();

       //
       int left = 0;
       int right = charArray.length - 1;

       while (left < right) {
           char temp = charArray[left];
           charArray[left] = charArray[right];
           charArray[right] = temp;

           left++;
           right--;
       }
       return new String(charArray);
   }
}
