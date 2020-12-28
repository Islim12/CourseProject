package org.csystem.homeworks.hmw1;

class Q1 {
    public static void main(String [] args)
    {
        FindMidApp.run();
    }
}

class SortNumsTestApp {
    public static void run()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        int num1 = Integer.parseInt(kb.nextLine());

        System.out.print("Enter the 2nd number: ");
        int num2 = Integer.parseInt(kb.nextLine());

        System.out.print("Enter the 3rd number: ");
        int num3 = Integer.parseInt(kb.nextLine());

        int sum = num1 + num2 + num3;
        int max = SortingNums.max(num1, num2, num3);
        int min = SortingNums.min(num1, num2, num3);
        int mid = SortingNums.mid(max, min, sum);

        SortingNums.outputOfSorting(max, mid, min);
    }
}

class SortingNums {
    public static int max(int a, int b, int c)
    {
        if (a >= b && a >= c)
            return a;
        if (b >= a && b >= c)
            return b;
        else
            return c;
    }

    public static int mid(int max, int min, int sum)
    {
        return sum - (max + min);
    }

    public static int min(int a, int b, int c)
    {
        if (a <= b && a <= c)
            return a;
        if (b <= a && b <= c)
            return b;
        else
            return c;
    }

    public static void outputOfSorting(int max, int mid, int min)
    {
        System.out.printf("%d ", min);

        if (min == mid)
            System.out.printf("= %d ", mid);
        else
            System.out.printf("< %d ", mid);

        if (mid == max)
            System.out.printf("= %d ", max);
        else
            System.out.printf("< %d ", max);
    }
}
