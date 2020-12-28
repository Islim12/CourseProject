package org.csystem.homeworks.hmw4;


class Q1 {
    public static void main(String[] args)
    {
        TestApp.run();
    }
}

class TestApp {
    public static void run()
    {
        int count = 0, sum = 0, ctrl = 1, max = 0, min = 100, num;

        do {
            num = getNumber();
            sum += num;
            count++;

            max = Math.max(max, num);
            min = Math.min(min, num);

        } while (ctrl != 0);

        double avg = sum / count;

        System.out.printf("The number of inputs %d.%n", count);
        System.out.printf("Max = %d%n", max);
        System.out.printf("Min = %d%n", min);
        System.out.printf("Average = %f%n", avg);

    }

    public static int getNumber()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = Integer.parseInt(kb.nextLine());

        if (num < 0 || num > 100)
            do {
                System.out.println("Invalid input.");
                System.out.print("Enter an integer: ");
                num = Integer.parseInt(kb.nextLine());

            } while (num < 0 || num > 100);


        return num;
    }

    public static int control()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.print("Do you want to enter a new value? [Press 1(one) for YES, Press 0(zero) for NO] ");
        int ctrl = Integer.parseInt(kb.nextLine());

        return 1;
    }

}
