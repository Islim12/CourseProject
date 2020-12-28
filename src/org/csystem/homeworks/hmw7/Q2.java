package org.csystem.homeworks.hmw7;

import org.csystem.app.samples.dateapp.DateUtil;

/* Çağrıldığında ekrana 01.01.1900 ve 31.12.2100 arasında rastgele bir tarihi yazan
printRandomDate isimli metodu yazınız. Metodun ekrana yazdırdığı tarih geçerli bir tarih olmalıdır. Rasgele tarihin Şubat ayına denk
gelmesi durumunda, seçilen yılın artık yıl olup olmamasına göre, Şubat ayı 29 çekebilecektir. Tarih ekrana aşağıdaki formatta yazdırılacaktır:
11th Jul 1983 */
class Q2 {
    public static void main(String[] args)
    {
        RandomDateApp.run();
    }
}

class RandomDateApp {
    public static int day, mon, year;
    private static String [] ms_monthsEN = {"", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

    public static void run()
    {
        getDate();
    }

    public static void getDate()
    {
        java.util.Random r = new java.util.Random();

        day = r.nextInt(31) + 1;
        mon = r.nextInt(12) + 1;
        year = r.nextInt(200) + 1901;

        controlRandom();

    }

    public static void controlRandom()
    {
        if (DateUtil.isValidDate(day, mon, year))
            printRandomDate();
        else
            getDate();
    }

    public static void printRandomDate()
    {
        if (day == 1)
            System.out.printf("%dst ", day);
        else if (day == 2)
            System.out.printf("%dnd ", day);
        else if (day == 3)
            System.out.printf("%drd ", day);
        else
            System.out.printf("%dth ", day);

        System.out.printf("%s %d%n", ms_monthsEN[mon], year);
    }

}
