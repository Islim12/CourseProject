package org.csystem.homeworks.hmw5;

import static org.csystem.homeworks.hmw5.SumFactorsTestApp.sumFactors;

class Q4 {
    public static void main(String[] args)
    {
        PerfectNumTestApp.runA();
        PerfectNumTestApp.runB();
    }
}

class PerfectNumTestApp {
    public static void runA()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.print("Enter a number: ");
        int val = Integer.parseInt(kb.nextLine());

        System.out.println(isPerfect(val) ? "true" : "false");
    }

    public static void runB()
    {
        for (int i = 1000; i <= 9999; i++)
            if (isPerfect(i))
                System.out.println(i);
    }

    public static boolean isPerfect(int val)
    {
        return val == sumFactors(val);
    }
}
