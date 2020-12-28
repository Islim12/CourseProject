package org.csystem.homeworks.hmw8;
/*Klavyeden bir yazı giriniz. Yazı içerisinde iç içe küme parantezleri bulunuyor olsun.
En içteki küme parantezinin içerisindeki yazıyı yazdırınız.*/
class Q1 {
    public static void main(String[] args)
    {
        AppTest.run();
    }
}

class AppTest {
    public static void run()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        for (;;) {
            System.out.print("Enter a sentence:");
            String s = kb.nextLine();

            if (s.equals("quit"))
                break;

            System.out.printf("Result: %s%n", control(s));

        }
    }

    public static String control(String s)
    {
        int len = s.length();
        int sum = 0;

        for (int i = 0; i < len; i++)
            if (s.charAt(i) == '{' || s.charAt(i) == '}')
                sum++;
        if (sum % 2 != 0) //number of { == number of } control
            return "an incorrect entry";
        return getContent(s);

    }

    public static String getContent(String s)
    {	//First, an } incorrect { entry  || index1 > index2 control

        int index1 = s.lastIndexOf('{');
        int index2 = s.indexOf('{');

        if (index1 > index2)
            return "an incorrect entry";

        return s.substring(index1 + 1, index2);
    }
}