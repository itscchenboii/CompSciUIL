import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by chenc on 9/21/2016.
 */

public class MalFunction {
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(new File("malfunction.dat"));
        int sets = Integer.parseInt(in.nextLine());
        while(sets-->0)
        {
            String []array = in.nextLine().trim().split(" ");
            double a = Double.parseDouble(array[0]);
            double b = Double.parseDouble(array[1]);
            double c = Double.parseDouble(array[2]);
            double x = Double.parseDouble(array[3]);

            System.out.printf("%.3f%n", a*Math.pow(x,2)+b*x+c);
        }
    }
}
