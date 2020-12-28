package org.csystem.homeworks.hmw8;

/* Parametresiyle aldığı değişken isminin Java’da geçerli bir değişken ismi olup olmadığını test eden isLegal isimli metodu yazınız ve test ediniz.*/

class Q6 {
    public static void main(String[] args)
    {
        AppTest6.run();
    }
}

class AppTest6 {
    public static void run()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        for (;;) {
            System.out.print("Enter a keyword: ");
            String s = kb.nextLine();

            if (s.equals("quit"))
                break;

            if (Keyword.isLegal(s))
                System.out.println("true");
            else
                System.out.println("false");
        }
    }
}

class Keyword {
    public static int index1 = -1, index2;
    public static String str = "";

    public static boolean isLegal(String s)
    {
        int len1 = s.length();

        String num = "0123456789";
        int len2 = num.length();

        String nl = " *@+-<>{}[]()&,.;%#\"=!?^+'|/";
        int len3 = nl.length();

        String keyw = "if,do,for,new,try,int,extends,default,package,boolean,private,finally,case,enum,goto,this,char,long,byte,void,else,true,catch,short,final,super,float,const,while,class,false,break,throw,return,static,switch,assert,double,import,public,throws,native,abstract,continue,strictfp,volatile,protected,interface,transient,implements,instanceof,synchronized,";

        for (int i = 0; i < len2; i++)
            if (("" + s.charAt(0)).equals("" + num.charAt(i)))
                return false;

        if (!control(s, keyw))
            return false;

        for (int i = 0; i < len1; i++)
            for (int j = 0; j < len3; j++)
                if (("" + s.charAt(i)).equals("" + nl.charAt(j)))
                    return false;
        return true;

    }

    public static String getKeyword(String keyw)
    {
        index2 = index1 + 1;
        if ((index1 = keyw.indexOf(",", index1 + 1)) != -1)
            str = keyw.substring(index2, index1);
        return str;
    }

    public static boolean control(String s, String keyw)
    {

        int len2 = keyw.length();

        for (int i = 0; i < len2; ) {
            str = getKeyword(keyw);
            int len = str.length();
            if (s.equals(str))
                return false;
            i += len + 1;
        }

        return true;
    }
}



