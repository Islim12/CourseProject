package org.csystem.homeworks.hmw3;

import org.csystem.util.NumberUtil;

class Q1 {
    public static void main(String[] args) {
        AllContionsTestApp.run();
    }
}
class AllContionsTestApp {
    public static void run()
    {
        for (int i = 101; i < 1000; i += 2) //i += 2 since we do not have to check even numbers and they are not prime numbers.
            AllConditions.one(i);
    }
}
class AllConditions {
    public static int reverse(int num)
    {
        int rev = 0, digit;
        while (num != 0) {
            digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }
        return rev;
    }

    public static void one(int num)
    {
        if (reverse(num) > num)
            two(num);
    }

    public static void two(int num)
    {
        if(NumberUtil.isPrime(num))
            three(num);
    }

    public static void three(int num)
    {
        if(NumberUtil.isPrime(reverse(num)))
            four(num);
    }

    public static void four(int num)
    {
        if(NumberUtil.isPrime(num / 10))
            five (num);
    }

    public static void five(int num)
    {
        if(NumberUtil.isPrime(num % 100))
            six(num);
    }

    public static void six(int num)
    {
        if (NumberUtil.isPrime(reverse(num) / 10))
            seven(num);
    }

    public static void seven(int num)
    {
        if (NumberUtil.isPrime(reverse(num) % 100))
            System.out.printf("%d ", num);
    }

}
