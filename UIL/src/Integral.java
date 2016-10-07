import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class Integral {
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(new File("integral.dat"));
        int sets = Integer.parseInt(in.nextLine());
        while(sets-->0)
        {
            String [] array = in.nextLine().trim().split(" ");
            double d1 = Double.parseDouble(array[0]);
            double d2 = Double.parseDouble(array[1]);
            double interval = Double.parseDouble(array[2]);
            double total = 0;
            for (double i = d1; i < d2; i+=interval) {
                total += ((3*Math.pow(i,2))+(2*i)+1)*interval;
            }
            System.out.printf("%.6f%n",total);
        }
    }
}