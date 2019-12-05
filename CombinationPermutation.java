package javaapplication19;

import java.util.Scanner;

public class CombinationPermutation extends main1 {

    public static void exit() {

        main1 main = new main1();

        Scanner In = new Scanner(System.in);
        System.out.println("End of Program");
        System.out.println("[1] Yes");
        System.out.println("[2] No");
        System.out.print("Do you want to continue?");

        int choice = In.nextInt();

        if (choice == 1) {

            main.main(null);

        } else if (choice == 2) {

            System.out.println("Thank you!");

        } else {

            System.out.println("Invalid input!");
            exit();
        }

    }

    public static void display1() {

        Scanner In = new Scanner(System.in);
        System.out.println("                    ");
        System.out.println("Permutations and Combinations");
        System.out.println("[1] Permutation Without Repetition");
        System.out.println("[2] Permutation With Repetition");
        System.out.println("[3] Combination without Repetition");
        System.out.println("[4] Combination with Repetition");
        System.out.println("                    ");
        System.out.print("Enter your choice: ");
        int Menu = In.nextInt();

        perwithoutrepe choice = new perwithoutrepe();
        perwithrepe choice2 = new perwithrepe();
        combiWOrepe choice3 = new combiWOrepe();
        combiwithrepe choice4 = new combiwithrepe();

        if (Menu == 1) {

            choice.Withoutrepe();
            exit();

        } else if (Menu == 2) {

            choice2.Withrepe();
            exit();

        } else if (Menu == 3) {

            choice3.Withoutrepe();
            exit();

        } else if (Menu == 4) {

            choice4.Withrepe();
            exit();

        } else {

            System.out.println("Invalid input!");
            exit();

        }
    }

}
