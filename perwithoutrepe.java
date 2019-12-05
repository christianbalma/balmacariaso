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
public class perwithoutrepe {

    public static BigInteger Permutation(long N, long R) {
        BigInteger acResult = new BigInteger("1");
        BigInteger abResult = new BigInteger("1");
        BigInteger wResult = new BigInteger("0");
        long L = N - R;
        System.out.println("                    ");
        System.out.println("Results");
        for (long i = 1; i <= N; i++) {

            acResult = acResult.multiply(BigInteger.valueOf(i));

        }
        System.out.println("Factorial of " + N + ": " + acResult);

        for (long i = 1; i <= L; i++) {

            abResult = abResult.multiply(BigInteger.valueOf(i));
        }
        System.out.println("n- r factoral: " + abResult);
        System.out.println("                                   ");

        wResult = acResult.divide(abResult);
        return wResult;

    }

    public static void exit() {

        main1 main = new main1();

        Scanner In = new Scanner(System.in);
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

    public static void Withoutrepe() {

        Scanner In = new Scanner(System.in);
        System.out.println("                    ");
        System.out.println("Permutations without Repetitions");
        System.out.print("Enter value for 'n': ");
        long N = In.nextLong();
        System.out.print("Enter another value for 'r': ");
        long R = In.nextLong();

        if (R < 0 || N < 0) {

            System.out.println("Sorry. The 'n' value and 'r' value should not be negative.");
            exit();

        } else if (R > 500 || N > 500) {
            System.out.println("Sorry, the limit has exceeded. Number should be less than 500.");
            exit();
        } else if (R > N) {
            System.out.println("Sorry. The 'r' value should be less than or equal to 'n' value.");
            exit();
        } else {
            System.out.println(" " + N + "P" + R + " is " + Permutation(N, R));
            System.out.println("             ");
            exit();
        }

    }
}
