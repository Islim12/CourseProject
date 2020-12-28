package org.csystem.homeworks.hmw8;

/*Klavyeden girilen bir yazının başındaki ve sonundaki boşlukları atarak yazıyı parantez içine alan programı yazınız.
Programı bir tane String referansı kullanarak yazınız.  */

class Q3 {
    public static void main(String[] args)
    {
        AppTest3.run();
    }
}

class AppTest3 {
    public static void run()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        for (;;) {
            System.out.print("Enter a sentence: ");
            String s = kb.nextLine();

            if (s.equals("quit"))
                break;

            result(s);
        }
    }

    public static void result(String s)
    {
        System.out.printf("(%s)%n", s.trim());
    }
}
