import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by chenc on 9/29/2016.
 */
public class conversions
{
    public static void main(String[] args) throws IOException
    {
        Scanner in = new Scanner(new File("conversions.dat"));

        int sets = Integer.parseInt(in.nextLine().trim());

        while(sets-->0)
        {
            String[] array = in.nextLine().trim().split(" ");
            double a = Double.parseDouble(array[0]);
            double b = Double.parseDouble(array[1]);
            double c = Double.parseDouble(array[2]);
            double d = Double.parseDouble(array[3]);

            double crash = (a/4)+7*b;
            double dash = (a+Math.pow(b,2))/(a+(1/b))+(a/b);
            double mash = 1/((1/a)-(1/b));
            double trash = (4/(a/b))*Math.pow((1+(5/(c+d)))/a,1.0/2)-(a/(c+d));

            System.out.printf("%.2f%n%.2f%n%.2f%n%.2f%n%n",crash,dash,mash,trash);
        }
    }
}
