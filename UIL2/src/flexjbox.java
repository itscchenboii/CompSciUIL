import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by chenc on 9/29/2016.
 */
public class flexjbox
{
    public static void main(String[] args) throws IOException
    {
        Scanner in = new Scanner(new File("flexjbox.dat"));

        int sets = Integer.parseInt(in.nextLine().trim());

        while(sets-->0)
        {
            String[] array = in.nextLine().trim().split(" ");
            String[][]flex = new String[Integer.parseInt(array[0])][Integer.parseInt(array[1])];

            for (int i = 0; i < Integer.parseInt(array[0]); i++)
            {
                for (int j = 0; j < Integer.parseInt(array[1]); j++)
                {
                    flex[i][j]="*";
                }
            }

            flex[Integer.parseInt(array[2])][Integer.parseInt(array[3])] = "J";

            for (int i = 0; i < flex.length; i++) {
                for (int j = 0; j < flex[i].length; j++) {
                    System.out.print(flex[i][j]);
                }
                System.out.println();
            }
        }
    }
}
