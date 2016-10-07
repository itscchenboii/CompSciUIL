/**
 * Created by chenc on 9/20/2016.
 */

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class Speed {
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(new File("speed.dat"));
        int sets = Integer.parseInt(in.nextLine());
        while(sets-->0)
        {
            double seconds = Double.parseDouble(in.nextLine());
            double speed = (double)seconds / (double)5;
            System.out.printf("%.1f%n",speed);
        }
    }
}
