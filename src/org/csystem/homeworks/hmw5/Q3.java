package org.csystem.homeworks.hmw5;

import static org.csystem.homeworks.hmw5.SumFactorsTestApp.*;

public class Q3 {
    public static void main(String[] args)
    {
        AreFriendsTestApp.run();
    }
}

class AreFriendsTestApp {
    public static void run()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        int x = Integer.parseInt(kb.nextLine());

        System.out.print("Enter the 2nd number: ");
        int y = Integer.parseInt(kb.nextLine());

        System.out.printf("%d and %d are %s ", x, y, areFriends(x, y) ? "friends." : "not friends.");
    }

    public static boolean areFriends(int x, int y)
    {
        return x == sumFactors(y) && y == sumFactors(x);
    }
}

