package org.csystem.homeworks.hmw6;
/* Craps hemen hemen dünyanın her yerinde bilinen, iki zarla oynanan bir oyundur.
Oyunun kuralları şöyledir :
Zarları atacak oyuncu oyunu kasaya karşı oynar. Atılan iki zarın toplam değeri
i)7 ya da 11 ise oyuncu kazanır.
ii)2, 3, 12 ise oyuncu kaybeder. (Buna craps denir!)
iii)İki zarın toplam değeri yukarıdakilerin dışında bir değer ise (yani 4, 5, 6, 8, 9, 10) oyun şu şekilde devam eder:
Oyuncu aynı sonucu buluncaya kadar zarları tekrar atar. Eğer aynı sonucu bulamadan önce oyuncu 7 atarsa (yani atılan iki zarın toplam değeri 7
olursa) oyuncu kaybeder. Eğer 7 gelmeden önce oyuncu aynı sonucu tekrar atmayı başarırsa , kazanır.*/

class Q1 {
    public static void main(String[] args)
    {
        CrapsTestApp.run();
    }
}

class CrapsTestApp {
    public static int countWin, countGame;

    public static void run()
    {
        for (countGame = 0; countGame < 100_000; countGame++)
            if (winning(getDiceSum()))
                countWin++;
        prob();
    }

    public static int getDiceSum()
    {
        java.util.Random r = new java.util.Random();
        int sum = r.nextInt(6) + 1 + r.nextInt(6) + 1;

        return sum;
    }

    public static boolean winning(int sum)
    {
        if (sum != 7 && sum != 11)
            if (losing(sum))
                return false;
        return true;
    }

    public static boolean losing(int sum)
    {
        int sum2 = 0;
        if (sum != 2 && sum != 3 && sum != 12)
        {
            while ((sum2 = getDiceSum()) != sum)
                if (sum2 == 7)
                    return true;
            return false;
        }
        return true;
    }

    public static void prob()
    {
        double prob = (double)countWin / countGame;

        System.out.printf("%f", prob);
    }
}
