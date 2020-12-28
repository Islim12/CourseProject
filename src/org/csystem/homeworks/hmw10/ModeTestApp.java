package org.csystem.homeworks.hmw10;

import java.util.Scanner;
import static org.csystem.util.ArrayUtil.mode;

public class ModeTestApp {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);

        for (;;) {
            System.out.print("Enter the size of the array: ");
            int n = Integer.parseInt(kb.nextLine());
            if (n == 0)
                break;
            int [] a = new int[n];

            System.out.print("Enter the numbers: ");
            for (int i = 0; i < n; i++)
                a[i] = Integer.parseInt(kb.nextLine());

            System.out.printf("The mode of the array: %d%n", mode(a));
        }
    }
}
