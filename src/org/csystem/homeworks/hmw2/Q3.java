package org.csystem.homeworks.hmw2;

import org.csystem.util.NumberUtil;

class Q3 {
    public static void main(String[] args)
    {
        DivisorTestApp.run();
    }
}

class DivisorTestApp {
    public static void run()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int n = Integer.parseInt(kb.nextLine());

        int halfVal = n / 2;

        for (int i = 2; i <= halfVal; )
            if (NumberUtil.isPrime(i)) {
                if (n % i == 0) {
                    System.out.printf("%d ", i);
                    n /= i;
                }
                else
                    i++;
            }
            else
                i++;
    }
}

