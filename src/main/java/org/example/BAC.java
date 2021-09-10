package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jeremy Rosales
 */
public class BAC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float result, A, W, r = 0, H;

        System.out.print("Enter a 1 is you are male or a 2 if you are female: ");
        switch (input.nextInt()) {
            case 1:
                r = 0.73f;
                break;
            case 2:
                r = 0.66f;
                break;
        }

        System.out.print("How many ounces of alcohol did you have? ");
        A = input.nextFloat();
        System.out.print("What is your weight, in pounds? ");
        W = input.nextFloat();
        System.out.print("How many hours has it been since your last drink? ");
        H = input.nextFloat();

        result = (float) ((A * 5.14 / W * r) - .015 * H);
        System.out.printf("\nYour BAC is %.6f\n", result);
        System.out.println(result >= 0.08 ? "It is not legal for you to drive." : "It is legal for you to drive.");

    }
}
