import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Chris on 9/21/2016.
 */
public class Resize
{
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("resize.dat"));
        int sets = Integer.parseInt(in.nextLine());

        while(sets-->0)
        {
            String[]array = in.nextLine().trim().split(" ");
            double oLength = Integer.parseInt(array[0]);
            double oWidth = Integer.parseInt(array[2]);
            double nLength = Integer.parseInt(array[4]);
            double nWidth = Integer.parseInt(array[6]);

            double a = (oWidth*nLength)/oLength;
            double b = (oLength*nWidth)/oWidth;


            System.out.printf("%.2f by %.2f or %.2f by %.2f%n",nLength,a,b,nWidth);
        }
    }
}
