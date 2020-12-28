package org.csystem.homeworks.hmw5;

class Q2 {
    public static void main(String[] args)
    {
        SumFactorsTestApp.run();
    }
}

class SumFactorsTestApp {
    public static void run()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = Integer.parseInt(kb.nextLine());

        System.out.printf("Sum of all the factors(including 1): %d", sumFactors(n));
    }

    public static int sumFactors(int val)
    {
        int sum = 1;
        for (int i = 2; i <= val / 2; i++) //tip: a number cannot be divided by the numbers that greater than half of the number
            if (val % i == 0)
                sum += i;
        return sum;
    }
}






