import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by chenc on 9/20/2016.
 */
public class Touchy
{
    public static void main(String[] args) throws IOException
    {
        Scanner in = new Scanner(new File("touchy.dat"));
        int sets = Integer.parseInt(in.nextLine().trim());
        while (sets-- >0)
        {
            String [] inputs = in.nextLine().trim().split(" ");
            int currentSetting = Integer.parseInt(inputs[0]);
            int timesPressed = Integer.parseInt(inputs[1]);
            while(timesPressed-- >0)
            {
                if(currentSetting ==3 )
                {
                    currentSetting = 0;
                    continue;
                }
                else
                {
                    currentSetting++;
                }
            }
            System.out.println(currentSetting);
        }
    }
}
