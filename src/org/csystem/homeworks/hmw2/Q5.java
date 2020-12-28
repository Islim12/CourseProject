package org.csystem.homeworks.hmw2;

import org.csystem.util.NumberUtil;

class Q5 {
    public static void main(String[] args)
    {
        GoldbachTestApp.run();
    }
}

class GoldbachTestApp {
    public static void run()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.print("Enter an even number: ");
        int n = Integer.parseInt(kb.nextLine());
        goldbach(n);
    }

    public static void goldbach(int n)
    {
        for (int i = 2; i <= n / 2; i++)
            if(NumberUtil.isPrime(i) && NumberUtil.isPrime(n - i))
                if ((i + (n - i)) == n)
                    System.out.printf("%d + %d%n", i, n - i);
    }
}
