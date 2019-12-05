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
public class stirlingnumbers {

    public static BigInteger Sterlingloop(long N, long R) {

        long tem1 = R;
        long last = R;
        BigInteger Factorial = new BigInteger("1");
        BigInteger LastProcess = new BigInteger("0");
        BigInteger FinalProcess = new BigInteger("0");
        BigInteger CompareFinal = new BigInteger("0");
        BigInteger Oliburboard = new BigInteger("-1");
        for (int Sub = 0; Sub < R; Sub++) {

            FinalProcess = FinalProcess.add(Sterlingnum(N, R, Sub, tem1));

            tem1--;
        }

        System.out.println("The Sum of All Processed Numbers Is: " + FinalProcess);
        for (int i = 1; i <= last; i++) {

            Factorial = Factorial.multiply(BigInteger.valueOf(i));

        }
        System.out.println("The Factorial of " + R + " is " + Factorial);
        LastProcess = FinalProcess.divide(Factorial);
        if (LastProcess.compareTo(CompareFinal) < 0) {
            LastProcess = LastProcess.multiply(Oliburboard);
            return LastProcess;
        } else {
            return LastProcess;

        }
    }

    public static BigInteger Sterlingnum(long N, long R, long Sub, long Temp1) {
        long mn = N;

        long mm = Sub;

        long n1 = R;
        long rr = 0;

        long tt = R;
        long jj = 0;
        long s = tt - Sub;

        int PWResult = 1;
        int Multiplier = -1;
        BigInteger Finals = new BigInteger("0");

        BigInteger Result = new BigInteger("1");
        BigInteger RResult = new BigInteger("1");
        BigInteger NMRResult = new BigInteger("1");
        BigInteger FResult;
        long C = n1 - Sub;
        BigInteger DResult;

        BigInteger Result2 = new BigInteger("1");

        BigInteger Final = new BigInteger("0");
        BigInteger Final2 = new BigInteger("0");
        BigInteger VFinal = new BigInteger("0");
        System.out.println("Results");
        for (; mn <= R; mn++) {

            PWResult *= Multiplier;

        }

        System.out.println("The Value For (-1)^i is: " + PWResult);
        for (long i = 1; i <= n1; i++) {

            Result = Result.multiply(BigInteger.valueOf(i));

        }
        for (long i = 1; i <= Sub; i++) {

            RResult = RResult.multiply(BigInteger.valueOf(i));

        }
        for (long i = 1; i <= C; i++) {

            NMRResult = NMRResult.multiply(BigInteger.valueOf(i));

        }
        DResult = RResult.multiply(NMRResult);
        FResult = Result.divide(DResult);
        while (N != 0) {

            Result2 = Result2.multiply(BigInteger.valueOf(s));

            N--;

        }
        Final = FResult.multiply(BigInteger.valueOf(PWResult));
        Final2 = Final.multiply(Result2);
        System.out.println(n1 + "C" + Sub + " is: " + FResult);
        System.out.println(tt + " - " + Sub + " = " + s);
        System.out.println("(" + s + ")^" + mn + " is: " + Result2);
        System.out.println("For " + Sub + " loop is: " + Final2);
        return Final2;
    }

    public static void exit() {

        Scanner In = new Scanner(System.in);
        System.out.println("End of Program");
        System.out.println("                ");
        System.out.print("Do you want to continue? ");
        System.out.println("[1] Yes");
        System.out.println("[2] No");
        int choice = In.nextInt();

        if (choice == 1) {

            main1.main(null);

        } else {

            System.out.println("Thank You");

        }

    }

    public static void Sterling() {
        Scanner In = new Scanner(System.in);
        System.out.println("                                   ");

        System.out.println("Stirling Number");
        System.out.print("Please enter value for 'n': ");
        long N = In.nextLong();
        System.out.print("Please enter another value for 'r': ");
        long R = In.nextLong();

        if (R < 0 || N < 0) {

            System.out.println("The 'n' value and 'r' value should not be negative ");
            exit();

        } else if (R > N) {

            System.out.println("                                   ");
            System.out.println("The 'r' Value Should Be Less Than Or Equal To 'n' Value");
            exit();

        } else if (R > N) {

            System.out.println("                                   ");
            System.out.println("The 'r' value should be less than or equal to n value");
            exit();

        } else if (R > 500 || N > 500) {

            System.out.println("The limit has exceeded number should be less than 500");
            exit();

        } else {

            System.out.println("                                   ");
            System.out.println("The Stirling of " + N + " and " + R + " is: " + Sterlingloop(N, R));
            exit();

        }

    }

}
