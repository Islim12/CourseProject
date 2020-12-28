package org.csystem.homeworks.hmw2;

class Q2 {
    public static void main(String[] args)
    {
        TimeTestApp.run();
    }

}

class TimeTestApp {
    public static void run()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.print("Saniyeyi girin ");
        long sec = Long.parseLong(kb.nextLine());

        System.out.printf("%d saniye %s", sec, Time.displayDuration(sec));
    }
}

class Time {
    public static String displayDuration(long s)
    {
        long hour = s / 3600;

        if (s >= 3600) {
            long min = (s / 60) % 60;
            long sec = s % 60;

            if (s % 3600 == 0)
                return hour + " saattir ";
            else
            if ((s / 60) >= 60)
                if ((s % 60) == 0)
                    return hour + " saat " + min + " dakikadır.";
                else
                    return hour + " saat " + min + " dakika " + sec + " saniyedir.";
        }

        else if (s >= 60) {
            long min = s / 60;
            long sec = s % 60;
            if  (s % 60 == 0)
                return min + " dakikadır.";
            else
                return min + " dakika " + sec + " saniyedir.";
        }

        else
            return s + " saniyedir.";
        return "";

    }
}
