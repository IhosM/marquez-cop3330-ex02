/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Ihosvany Marquez
 */

package exercise2;
import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {
        Scanner s = new Scanner(System.in);
        System.out.print("What is the input string? ");
        String input = s.nextLine();
        int inputLength = input.length();

        if(input.isEmpty())
        {
            System.out.println("You must enter something into the program");
        }
        else
        {
            System.out.println(input + " has " + inputLength + " characters.");

        }
    }
}
