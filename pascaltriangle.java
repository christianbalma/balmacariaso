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
public class pascaltriangle extends main1 {

    public static void Pascalloop(long m) {
        for (int i = 0; i <= m; i++) {
            int Sub = i;
            System.out.print(" " + Pascal(m, Sub) + "  ");

        }

    }

    public static BigInteger Pascal(long m, long sub) {
        BigInteger abResult = new BigInteger("1");
        BigInteger cResult = new BigInteger("1");
        BigInteger bnResult = new BigInteger("1");
        BigInteger qResult;
        long c = m - sub;
        BigInteger oResult;

        for (long i = 1; i <= m; i++) {

            abResult = abResult.multiply(BigInteger.valueOf(i));

        }
        for (long i = 1; i <= sub; i++) {

            cResult = cResult.multiply(BigInteger.valueOf(i));

        }
        for (long i = 1; i <= c; i++) {

            bnResult = bnResult.multiply(BigInteger.valueOf(i));

        }

        oResult = cResult.multiply(bnResult);

        qResult = abResult.divide(oResult);

        return qResult;

    }

    public static void exit() {

        main1 main = new main1();

        Scanner In = new Scanner(System.in);
        System.out.println("             ");
        System.out.println("End of Program");

        System.out.println("Do you want to continue? ");
        System.out.println("[1] Yes");
        System.out.println("[2] No");
        int choice = In.nextInt();

        if (choice == 1) {

            main.main(null);

        } else {

            System.out.println("THANK YOU :))))))))))");

        }

    }

    public static void Pascal() {

        Scanner In = new Scanner(System.in);
        System.out.println("              ");
        System.out.println("Pascal Triangle Row Generator");
        System.out.print("Please enter value for 'n': ");
        long D = In.nextLong();

        if (D < 0) {
            System.out.println("The 'n' value and 'r' value should not be negative ");
            exit();
        } else if (D > 500) {
            System.out.println("The Number You Enter Should Be Less Than 500");
            exit();
        } else {
            System.out.println("The Row " + D + " is: ");
            Pascalloop(D);
            exit();

        }
    }
}
