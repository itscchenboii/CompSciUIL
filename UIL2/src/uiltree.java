import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by chenc on 10/5/2016.
 */
public class uiltree
{
    public static void main(String[] args) throws IOException
    {
        Scanner in = new Scanner(new File("ytree.dat"));

        while(in.hasNextLine())
        {
            int height = Integer.parseInt(in.nextLine());
            int firstSpaces = 0;
            int middleSpaces = 1;

            for (int i = 2; i < height; i++) {
                middleSpaces += 2;
            }

            for (int i = 1; i < height; i++)
            {
                for (int j = 0; j < firstSpaces; j++)
                {
                    System.out.print(" ");
                }
                System.out.print("***");
                for (int j = 0; j < middleSpaces; j++)
                {
                    System.out.print(" ");
                }
                System.out.println("***");
                firstSpaces++;
                middleSpaces-=2;
            }
            for (int i = 0; i < firstSpaces; i++) {
                System.out.print(" ");
            }
            System.out.println("*****");
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < firstSpaces+1; j++) {
                    System.out.print(" ");
                }
                System.out.println("***");
            }
        }

    }
}
