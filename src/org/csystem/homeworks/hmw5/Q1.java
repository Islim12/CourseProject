package org.csystem.homeworks.hmw5;

class Q1 {
    public static void main(String[] args)
    {
        System.out.println(EulerNum.getE());
    }
}

class EulerNum {
    public static double getE()
    {
        double e = 0;

        for (int i = 0; i < 10; i++)
            e += 1. / factorial(i);
        return e;
    }

    public static long factorial(int val)
    {
        long result = 1; // n! = n * (n-1) * ... * 1. Hence, result must be assigned 1.

        for (int i = 2; i <= val; i++)
            result *= i;
        return result;
    }
}

