package org.csystem.homeworks.hmw8;
/*  Klavyeden girilen bir yazıyı ilk karakteri 1.satıra, ilk 2 karakteri 2.satıra, ilk 3 karakteri 3. satıra...
olacak şekilde ekrana yazdıran programı yazınız. */
class Q2 {

    public static void main(String[] args)
    {
        AppTest2.run();
    }
}

class AppTest2 {
    public static void run()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        for (;;) {
            System.out.print("Enter a word/sentence: ");
            String s = kb.nextLine();

            if (s.equals("quit"))
                break;

            result(s);
        }
    }

    public static void result(String s)
    {
        int len = s.length();
        for (int i = 0; i <= len; i++)
            System.out.println(s.substring(0, i));
    }
}
