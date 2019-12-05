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
public class combiwithrepe extends CombinationPermutation {

    public static BigInteger CWRepetition(long N, long R) {

        long N1 = N + R - 1;
        BigInteger N1Result = new BigInteger("1");
        long N2 = N - 1;
        BigInteger N2Result = new BigInteger("1");
        BigInteger RResult = new BigInteger("1");
        BigInteger FResult = new BigInteger("0");
        BigInteger FResult2 = new BigInteger("0");
        System.out.println("                ");
        System.out.println("Results");

        for (long i = 1; i <= N1; i++) {

            N1Result = N1Result.multiply(BigInteger.valueOf(i));

        }
        System.out.println("The factorial of (n + r - 1) is: " + N1Result);

        for (long i = 1; i <= R; i++) {

            RResult = RResult.multiply(BigInteger.valueOf(i));

        }
        System.out.println("The factorial of r is: " + RResult);

        for (long i = 1; i <= N2; i++) {

            N2Result = N2Result.multiply(BigInteger.valueOf(i));

        }

        System.out.println("The factorial of (n - 1) is: " + N2Result);

        FResult = RResult.multiply(N2Result);
        System.out.println("The answer in r!(n-1)! is " + FResult);
        FResult2 = N1Result.divide(FResult);

        return FResult2;

    }

    public static void exit() {

        main1 main = new main1();

        Scanner In = new Scanner(System.in);
        System.out.println("End of Program");
        System.out.println("            ");
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
        System.out.println("                      ");
        System.out.println("Combinations with Repetitions");
        System.out.print("Please enter value for 'n': ");
        long N = In.nextLong();
        System.out.print("Please enter another value for 'r': ");
        long R = In.nextLong();

        if (R < 0 || N < 0) {
            System.out.println("The 'n' value and 'r' value should not be negative ");
            exit();

        } else if (R > 500 || N > 500) {

            System.out.println("The limit has exceeded number should be less than 500");
            exit();

        } else {

            System.out.println("                                   ");
            System.out.println(" " + N + "C" + R + " with repetition is " + CWRepetition(N, R));
            exit();

        }

    }

}
