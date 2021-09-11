/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Carter I. Walker
 */

package org.example;
import java.util.Scanner;

public class App 
{
    public static final double conversionFactor = 0.09290304;
    
    public static void main( String[] args )
    {
        //Necessary Variables
        Scanner input = new Scanner(System.in);
        int length, width;
        double areaFeet, areaMeters;


        //Query for length and width
        System.out.println( "What is the length of the room in feet?" );
        length = input.nextInt();

        System.out.println("What is the width of the room in feet?");
        width = input.nextInt();

        //Calculation
        areaFeet = length * width;
        areaMeters = areaFeet * conversionFactor;

        //Final output
        System.out.println("The area is:");
        System.out.println(areaFeet + " square feet");
        System.out.println(areaMeters + " square meters");
    }
}
