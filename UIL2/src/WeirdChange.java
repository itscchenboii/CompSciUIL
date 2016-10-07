import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by chenc on 10/3/2016.
 */
public class WeirdChange
{

    public static int fortySevens, thirtySevens, twentyThrees, thirteens, fives, ones, totalCoins;

    public static void main(String[] args) throws IOException
    {
        Scanner in = new Scanner(new File("weirdChange.dat"));

        fortySevens = 0;
        thirtySevens =0;
        thirteens = 0;
        twentyThrees = 0;
        fives = 0;
        ones = 0;
        totalCoins = Integer.MAX_VALUE;

        while(in.hasNextLine())
        {
            int uilDollar = Integer.parseInt(in.nextLine().trim());
            double usDollar = uilDollar * .03;

            change(uilDollar, 0, 0, 0, 0, 0, 0, 0);
            totalCoins = Integer.MAX_VALUE;

            System.out.printf("$%.2f %d %d %d %d %d %d%n", usDollar, fortySevens, thirtySevens, twentyThrees, thirteens, fives, ones);
        }
    }

    public static void change(int money, int fs,int ts,int tt, int t, int f, int o, int currentCoins)
    {
        if(money > 0 && currentCoins < totalCoins) {
            if(money - 47 >= 0)
            change(money - 47, fs + 1, ts, tt, t, f, o, currentCoins + 1);
            if(money - 37 >= 0)
            change(money - 37, fs, ts + 1, tt, t, f, o, currentCoins + 1);
            if(money - 23 >= 0)
            change(money - 23, fs, ts, tt + 1, t, f, o, currentCoins + 1);
            if(money - 13 >= 0)
            change(money - 13, fs, ts, tt, t + 1, f, o, currentCoins + 1);
            if(money - 5 >= 0)
            change(money - 5, fs, ts, tt, t, f + 1, o, currentCoins + 1);
            if(money - 1 >= 0)
            change(money - 1, fs, ts, tt, t, f, o + 1, currentCoins + 1);
        }
        else if(money <= 0 && currentCoins < totalCoins)
        {
                fortySevens = fs;
                thirtySevens = ts;
                twentyThrees = tt;
                thirteens = t;
                fives = f;
                ones = o;
                totalCoins = currentCoins;
        }

    }
}
