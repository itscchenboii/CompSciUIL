import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by chenc on 9/29/2016.
 */
public class baseball
{
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(new File("baseball.dat"));

        while(in.hasNextLine()) {
            String[] array = in.nextLine().trim().split(" ");

            int[] bases = new int[3];
            for (int i = 0; i < 3; i++) {
                bases[i] = Integer.parseInt(array[i]);
            }
            int count = Integer.parseInt(array[3]);
            int runs = 0;
            boolean hitter = true;
            while (count-- > 0) {
                if (bases[2] == 1) {
                    runs++;
                }
                bases[2] = bases[1];
                bases[1] = bases[0];
                if (hitter) {
                    bases[0] = 1;
                    hitter = false;
                } else bases[0] = 0;
            }

            for (int i = 0; i < 3; i++) {
                System.out.print(bases[i]+" ");
            }
            System.out.println(runs);
        }
    }
}
