package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Select the number for the question: ");
        System.out.println("1. Calculate the sum of digits.");
        System.out.println("2. Prime number.");
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");
        System.out.println("6");
        System.out.println("7");
        System.out.println("8");
        System.out.println("9");
        System.out.println("10");
        System.out.print("Enter choice: ");
        int a = scan.nextInt();

        switch (a)
        {
            case 1:
                //Write a program to calculate the sum of digits in a given number.
                Calculatedigits.calculatedigits();
                break;

            case 2:
                //Create a function to check if a number is prime.
                Prime.prime();
                break;

            case 3:
                //Write a program to ﬁnd the largest element in an array.
                Largestelement.largestNumber();
                break;

            case 4:
                //Implement a simple calculator that can perform addition, subtraction, multiplication, and division.
                Calculator.calculator();
                break;

            case 5:
                //Write a function to reverse a string without using built-in reverse functions.
                Reverse.reverse();
                break;

            case 6:
                //Create a program to generate the Fibonacci sequence up to n terms.
                Fibonacci.fibonacciSequence();
                break;

            case 7:
                //Write a function to count the number of vowels in a string.
                Vowel.countVowel();
                break;
            case 8:
                //Implement a program to sort an array of integers using bubble sort without using built-in methods.

                break;

            case 9:
                //Create a function to check if two strings are anagrams.

                break;

            case 10:
                //Write a program to ﬁnd the second smallest element in an array.

                break;

            default:
                System.out.println("Invalid choice");
                break;

        }

//        //Write a program to calculate the sum of digits in a given number.
//        Calculatedigits.calculatedigits();
//
//        //Create a function to check if a number is prime.
//        Prime.prime();
//
//        //Write a program to ﬁnd the largest element in an array.
//        Largestelement.largestNumber();
//
//        //Implement a simple calculator that can perform addition, subtraction, multiplication, and division.
//        Calculator.calculator();
//
//        //Write a function to reverse a string without using built-in reverse functions.
//        Reverse.reverse();
//
//        //Create a program to generate the Fibonacci sequence up to n terms.
//        Fibonacci.fibonacciSequence();
//
//        //Write a function to count the number of vowels in a string.
//        Vowel.countVowel();
//
//        //Implement a program to sort an array of integers using bubble sort without using built-in methods.
//
//
//        //Create a function to check if two strings are anagrams.
//
//
//        //Write a program to ﬁnd the second smallest element in an array.
    }
}