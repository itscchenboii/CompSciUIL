import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by chenc on 9/28/2016.
 */
public class baseball
{
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(new File("baseball.dat"));

        while(in.hasNextLine())
        {
            String [] array = in.nextLine().trim().split(" ");
            int [] bases = new int[3];
            for (int i = 0; i < 3; i++) {
                bases[i]=Integer.parseInt(array[i]);
            }
            int hit = Integer.parseInt(array[3]);


            for (int i = 0; i < 3; i++) {
                System.out.print(bases[i] + " ");
            }
            System.out.println(Integer.parseInt(array[3]));
        }
    }
}
