import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * Created by chenc on 9/29/2016.
 */
public class daytoday
{
    public static void main(String[] args) throws IOException
    {
        Scanner in = new Scanner(new File("daytoday.dat"));

        int sets = Integer.parseInt(in.nextLine());

        while(sets-->0)
        {
            String[]array = in.nextLine().trim().split(" ");

            Calendar day1 = new GregorianCalendar(Integer.parseInt(array[2]),Integer.parseInt(array[0])-1,Integer.parseInt(array[1]));
            Calendar day2 = new GregorianCalendar(Integer.parseInt(array[5]),Integer.parseInt(array[3])-1,Integer.parseInt(array[4]));

            long diff = day2.getTimeInMillis()-day1.getTimeInMillis();
            System.out.println(TimeUnit.DAYS.convert(diff,TimeUnit.MILLISECONDS)-1);
        }
    }
}