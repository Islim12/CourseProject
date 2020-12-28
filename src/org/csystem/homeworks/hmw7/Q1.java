package org.csystem.homeworks.hmw7;
/* Bir tombala torbasında 1'den 99'a kadar numaralanmış (99 dahil) pullar bulunmaktadır. Bu tombala torbasıyla
aşağıdaki oyunlar oynanmaktadır:
Çekilen bir pul torbaya geri atılmamak üzere
i) Torbadan 3 pul çekiliyor. Çekilen pulların toplamı 150' den küçük ise oyuncu kazanıyor.
ii) Torbadan 3 pul çekiliyor. Çekilen pulların toplamı asal sayı ise oyuncu kazanıyor.
iii) Torbadan 3 pul çekiliyor. En büyük değerli pul ile en küçük değerli pul arasındaki fark ortanca değerli puldan
büyükse oyuncu kazanıyor.
Oynanacak her bir oyun için oyuncunun kazanma olasılığını en az 30000 oyunu simule ederek hesaplayınız */

import org.csystem.util.NumberUtil;

class Q1 {
    public static void main(String[] args)
    {
        LottoTestApp.run();
    }
}

class LottoTestApp {
    public static int countWin, countGame, num1, num2, num3;

    public static void run()
    {
        for (countGame = 0; countGame < 300_000; countGame++)
            if (winning(getThreeLottoNumSum()))
                countWin++;
        prob();
    }

    public static int getThreeLottoNumSum()
    {
        java.util.Random r = new java.util.Random();

        num1 = r.nextInt(99) + 1;
        num2 = r.nextInt(99) + 1;
        num3 = r.nextInt(99) + 1;

        while (num1 == num2 || num1 == num3 || num2 == num3) //all three numbers must be different.
        {
            if (num1 == num2)
                num2 = getDiffNum(num1, num2);
            if (num1 == num3)
                num3 = getDiffNum(num1, num3);
            if (num2 == num3)
                num3 = getDiffNum(num2, num3);
        }
        return num1 + num2 + num3;
    }


    public static int getDiffNum(int num1, int num2)
    {
        java.util.Random r = new java.util.Random();

        while (num1 == num2)
            num2 = r.nextInt(99) + 1;
        return num2;
    }

    public static boolean winning(int sum)
    {
        int max = NumberUtil.max(num1, num2, num3);
        int min = NumberUtil.min(num1, num2, num3);
        int subt = max - min;

        if (sum < 150 || NumberUtil.isPrime(sum) || subt > NumberUtil.mid(max, min, sum))
            return true;
        return false;
    }

    public static void prob()
    {
        double prob = (double)countWin / countGame;

        System.out.printf("%f", prob);
    }
}