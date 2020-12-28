package org.csystem.homeworks.hmw2;

class Q1 {
        public static void main(String [] args)
        {
            PatternTestApp.run();
        }
}

class PatternTestApp {
    public static void run()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = Integer.parseInt(kb.nextLine());

        PatternImage.up(n);

        PatternImage.middle(n);

        PatternImage.down(n);
    }
}

class PatternImage {
    public static void up(int n)
    {
        int a = 1;
        for (int i = 0; i < n - 1; i++)
        {
            for (int j = a; j < n; j++)
                System.out.print(" ");
            a++;
            for (int k = 1; k <= 2*i + 1; k++)
                System.out.print("*");
            System.out.println();
        }
    }

    public static void middle(int n)
    {
        for (int i = 0; i < 2 * n - 1; i++)
            System.out.print("*");
        System.out.println();
    }

    public static void down(int n)
    {
        int a = n;
        for (int i = 0; i < n - 1; i++)
        {
            for (int j = a; j <= n ; j++)
                System.out.print(" ");
            a--;
            for (int k = 1; k <= 2 * a - 1; k++)
                System.out.print("*");

            System.out.println();
        }
    }
}


