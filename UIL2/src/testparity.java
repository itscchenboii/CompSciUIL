import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by chenc on 10/3/2016.
 */
public class testparity
{
    public static void main(String[] args) throws IOException
    {
        Scanner in = new Scanner(new File("testparity.dat"));
        ArrayList<Integer>array = new ArrayList<>();

        while(in.hasNextInt())
        {
            array.add(in.nextInt());
        }

        for (int i = 0; i < array.size(); i++)
        {
            double score = array.get(i);

            if (score > 0 && score <=25)
            {
                score*=2;
            }
            else if(score > 25 && score <=50)
            {
                score*=1.5;
            }
            else if(score >50 && score<=75)
            {
                score*=1.25;
            }
            else if(score>100 && score<=120)
            {
                score *= .9;
            }
            int score1 = (int)Math.round(score);
            array.set(i, score1);
        }

        for (int i = 0; i < array.size()-1; i++) {
            System.out.print(array.get(i)+" ");
        }
        System.out.println(array.get(array.size()-1));
    }
}
