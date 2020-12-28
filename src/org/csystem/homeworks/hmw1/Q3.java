package org.csystem.homeworks.hmw1;

class Q3 {

    public static void main(String[] args)
    {
        FindSignumTestApp.run();
    }

}

class FindSignumTestApp {
    public static void run()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = Integer.parseInt(kb.nextLine());

        System.out.printf("%d", FindSignum.signum(n));
    }
}

class FindSignum {
    public static int signum(int n)
    {
        if (n < 0)
            return -1;
        else if (n == 0)
            return 0;
        else
            return 1;
    }
}
