/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Manolo
 */
public class perwithrepe {

    public static BigInteger PWRepe(long N, long R) {

        BigInteger PResult = new BigInteger("1");
        while (R != 0) {

            PResult = PResult.multiply(BigInteger.valueOf(N));
            System.out.println(PResult);
            R--;

        }
        System.out.println("                                          ");
        System.out.println("Results");
        return PResult;
    }

    public static void exit() {

        main1 main = new main1();

        Scanner In = new Scanner(System.in);
        System.out.println("                  ");
        System.out.println("Do you want to continue? ");
        System.out.println("[1] Yes");
        System.out.println("[2] No");
        int choice = In.nextInt();

        if (choice == 1) {

            main.main(null);

        } else {

            System.out.println("Thank you!");

        }

    }

    public static void Withrepe() {

        Scanner In = new Scanner(System.in);
        System.out.println("            ");
        System.out.println("Permutation with Repetitions");

        System.out.print("Please enter value for 'n': ");
        long N = In.nextLong();
        System.out.print("Please enter another value for 'r': ");
        long R = In.nextLong();

        if (R < 0 || N < 0) {

            System.out.println("Sorry. The 'n' value and 'r' value should not be negative.");
            exit();

        } else if (R > 500 || N > 500) {

            System.out.println("Sorry, the limit has exceeded. Number should be less than 500");
            exit();

        } else {
            System.out.println(" " + N + "P" + R + " with repetition is " + PWRepe(N, R));
            System.out.println("              ");
            exit();

        }

    }
}
