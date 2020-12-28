package org.csystem.homeworks.hmw9;

import java.util.Scanner;
import static org.csystem.util.NumberUtil.getDigits;

public class MastermindApp {
    public static void run() {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter the secret number: ");
        int val1 = Integer.parseInt(kb.nextLine());
        int val2 = 0;

        int remain = 10;
        while (remain != 0) {
            System.out.print("Which number do you predict? ");
            val2 = Integer.parseInt(kb.nextLine());

            if (val1 == val2) {
                System.out.println("You won!");
                break;
            }

            System.out.println(Mastermind.message(val1, val2));
            remain--;
        }

        if (val1 != val2)
            System.out.println("You failed!");

    }
}

class Mastermind {
    public static int countPst, countNgv;
    public static String message(int val1, int val2)
    {
        String str = "";

        mastermindTrial(getDigits(val1), getDigits(val2));

        if (countPst == 1)
            str += "+";
        else if (countPst >= 1)
            str += "+" + countPst;

        if (countNgv == 1)
            str += "-";
        else if (countNgv > 1)
            str += "-" + countNgv;

        countNgv = 0;
        countPst = 0;
        return str;
    }

    public static void mastermindTrial(int[] a, int[] b)
    {
        for (int i = 0; i < 4; i++) {
            if (a[i] == b[i])
                countPst++;
            for (int j = 0; j < 4; j++)
                if (i != j && a[i] == b[j])
                    countNgv++;
        }
    }
}