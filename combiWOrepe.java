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
public class combiWOrepe extends CombinationPermutation {

    public static BigInteger Combination(long N, long R) {

        BigInteger NRResult = new BigInteger("1");
        BigInteger RResult = new BigInteger("1");
        BigInteger NMRResult = new BigInteger("1");
        BigInteger FResult;
        long c = N - R;
        BigInteger DResult;
        System.out.println("                  ");
        System.out.println("Results");

        // for n!
        for (long i = 1; i <= N; i++) {

            NRResult = NRResult.multiply(BigInteger.valueOf(i));

        }
        System.out.println("Factorial of " + N + ": " + NRResult);

        //for r!
        for (long i = 1; i <= R; i++) {

            RResult = RResult.multiply(BigInteger.valueOf(i));

        }

        System.out.println("Factorial of " + R + ": " + RResult);

        //for (n-r)!
        for (long i = 1; i <= c; i++) {

            NMRResult = NMRResult.multiply(BigInteger.valueOf(i));
        }

        System.out.println("n-r factorial: " + NMRResult);
        System.out.println("                                   ");

        //for r!(n-r)!
        DResult = RResult.multiply(NMRResult);

        //for n!/r!(n-r)!
        FResult = NRResult.divide(DResult);
        return FResult;

    }

    public static void exit() {

        main1 main = new main1();

        Scanner In = new Scanner(System.in);
        System.out.println("End of Program");
        System.out.println("                 ");
        System.out.println("Do you want to continue? ");
        System.out.println("[1] Yes");
        System.out.println("[2] No");

        int choice = In.nextInt();

        if (choice == 1) {

            main.main(null);

        } else {

            System.out.println("Thank you!");
            System.exit(0);
        }

    }

    public static void Withoutrepe() {

        Scanner In = new Scanner(System.in);
        System.out.println("                          ");
        System.out.println("Combinations without Repetitions");
        System.out.print("Please enter value for 'n': ");
        long N = In.nextLong();
        System.out.print("Please enter another value for 'r': ");
        long R = In.nextLong();

        if (R < 0 || N < 0) {
            System.out.println("The 'n' value and 'r' value should not be negative.");
            exit();

        } else if (R > N) {

            System.out.println("                                   ");
            System.out.println("The 'r' value should be less than or equal to 'n' value");
            exit();

        } else if (R > 500 || N > 500) {

            System.out.println("The limit has exceeded number should be less than 500");
            exit();

        } else {
            System.out.println(" " + N + "C" + R + " is " + Combination(N, R));
            exit();

        }

    }
}
