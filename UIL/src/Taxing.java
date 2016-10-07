import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by chenc on 9/20/2016.
 */
public class Taxing {
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(new File("taxing.dat"));
        int sets = Integer.parseInt(in.nextLine());
        while(sets-->0)
        {
            double price = Double.parseDouble(in.nextLine());
            double total = price + price * 0.0825;
            System.out.printf("$%.2f%n",total);
        }
    }
}
