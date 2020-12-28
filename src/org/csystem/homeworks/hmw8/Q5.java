package org.csystem.homeworks.hmw8;

/* Parametresi ile aldığı yazının içindeki küçük harfleri büyük harfe, büyük harfleri ise küçük harfe çevirip yeni bir String ile
geri dönen changeCase isimli metodu yazınız. */

import org.csystem.util.StringUtil;

class Q5 {
    public static void main(String[] args)
    {
        AppTest5.run();
    }
}

class AppTest5 {
    public static void run()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        for (;;) {
            System.out.print("Enter a sentence: ");
            String s = kb.nextLine();

            if (s.equals("quit"))
                break;

            System.out.println(StringUtil.changeCase(s));
        }

    }
}
