import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by chenc on 10/3/2016.
 */
public class taxi
{
    public static void main(String[] args) throws IOException
    {
        Scanner in = new Scanner(new File("taxi.dat"));

        while(in.hasNextLine())
        {
            String [] array = in.nextLine().trim().split(" ");

            double miles = Double.parseDouble(array[0]);
            double timeWaiting = Double.parseDouble(array[1]);
            double total = 0;

            miles -= .2;
            total += .5;

            while(miles >.01)
            {
                miles-=.2;
                total+=.22;
            }

            while(timeWaiting>0)
            {
                timeWaiting-=60;
                total+=.2;
            }

            System.out.printf("$%.2f%n", total);
        }
    }
}
