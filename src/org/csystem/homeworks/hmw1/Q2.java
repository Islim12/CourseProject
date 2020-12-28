package org.csystem.homeworks.hmw1;

public class Q2 {
    public static void main(String [] args)
    {
        FindMidApp.run();
    }
}

class FindMidApp {
    public static void run()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        int num1 = Integer.parseInt(kb.nextLine());

        System.out.print("Enter the 2nd number: ");
        int num2 = Integer.parseInt(kb.nextLine());

        System.out.print("Enter the 3rd number: ");
        int num3 = Integer.parseInt(kb.nextLine());

        System.out.printf("mid: %d ", mid(num1, num2, num3));
    }

    public static int mid(int a, int b, int c)
    {
        int sum = a + b + c;
        return sum - (Math.max(Math.max(a, b), c) + Math.min(Math.min(a, b), c));
    }

}
