package org.csystem.homeworks.hmw3;

import org.csystem.util.NumberUtil;

class Q2 {
    public static void main(String[] args)
    {
        PrimeXTestApp.run();
    }
}

class PrimeXTestApp {
    public static void run()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = Integer.parseInt(kb.nextLine());

        if (Num.isPrimeX(n))
            System.out.println("true");
        else
            System.out.println("false");
    }
}

class Num {
    public static boolean isPrimeX(int num)
    {
        for (int i = num; i >= 10; num = i) {
            if(!NumberUtil.isPrime(i))
                return false;
            if(!NumberUtil.isPrime(NumberUtil.getDigitsSum(i)))
                return false;
            else
                i = NumberUtil.getDigitsSum(i);
        }

        if (NumberUtil.isPrime(num))
            return true;
        else
            return false;
    }

}
