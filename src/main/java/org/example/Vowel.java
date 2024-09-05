package org.example;

import java.util.Scanner;

public class Vowel
{
        // using Scanner for user input words.
    public static void countVowel ()
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Imput the words for the vowels to be checked: ");
        String words = scan.nextLine();

        System.out.println("There are "+vowel(words)+" vowels");
    }
    private static int vowel (String words)
    {
        // first I try to list all the vowels using Array.

        char[] theVowels = {'a', 'i', 'u', 'e', 'o', 'w', 'y'};

        //I want to create a counter for the vowel.
        int count = 0;

        //I want to make the case comparable.
        words = words.toLowerCase();

        // next I try to check the words 1 by 1 using for loop.
        for (int i = 0 ; i < words.length() ; i++)
        {
            char a = words.charAt(i);

            // I want to check if the current character is a vowel.
            for (char vowel : theVowels)
            {
                if (a == vowel)
                {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}