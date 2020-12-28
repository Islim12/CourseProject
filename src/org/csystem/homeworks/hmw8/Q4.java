package org.csystem.homeworks.hmw8;

/*Parametresi ile aldığı iki yazının birincisi içerisinden ikincisindeki karakterlerin silinmiş olduğu yeni bir String döndüren
squeeze isimli metodu yazınız ve test ediniz */

import org.csystem.util.StringUtil;

public class Q4 {
    public static void main(String[] args)
    {
        AppTest4.run();
    }
}

class AppTest4 {
    public static void run()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        for (;;) {
            System.out.print("Enter a sentence: ");
            String s1 = kb.nextLine();

            if (s1.equals("quit"))
                break;

            System.out.print("Enter the characters that you do not want in the sentence: ");
            String s2 = kb.nextLine();

            System.out.println(StringUtil.squeeze(s1, s2));

        }
    }
}