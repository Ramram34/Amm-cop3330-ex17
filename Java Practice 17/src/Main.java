/*
 *  UCF COP3330 Fall 2021 Assignment 17 Solution
 *  Copyright 2021 Rami Amm
 */

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        int A, W, H, g;
        float r;
        double BAC;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 1 if you are male or a 2 if yoy are female: ");
        g = sc.nextInt();

        System.out.print("How many ounces of alcohol did you have ? ");
        A = sc.nextInt();

        System.out.print("What is your weight, in pounds ? ");
        W = sc.nextInt();

        System.out.print("How many hours has it been since yours last drink? ");
        H = sc.nextInt();

        sc.close();

        if (g == 1) {
            r = (float) 0.73;
        }
        else{
            r = (float) 0.66;
        }

        BAC = (A * 5.14 / W * r) - (0.015 * H);

        System.out.println("Your BAC is " + BAC);
        if (BAC < 0.08) {
            System.out.println("It is legal for you to drive.");
        }
        else{
            System.out.println("It is illegal for you to drive.");
        }
    }
}
