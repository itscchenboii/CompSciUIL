import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by chenc on 9/21/2016.
 */

public class Periodic {
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(new File("periodic.dat"));

        ArrayList<String> elements= new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            String[]array=in.nextLine().trim().split(" ");
            for (int j = 0; j < array.length; j++) {
                elements.add(array[j].toLowerCase());
            }
        }

        int sets = Integer.parseInt(in.nextLine());
        while(sets-->0)
        {
            String word = in.nextLine();
            int counter = 0;
            boolean yesOrNo = true;
            while(counter < word.length())
            {
                if(elements.contains(word.substring(counter,counter+1)))
                {
                    counter++;

                    continue;
                }
                if(counter+2<=word.length())
                {
                    if(elements.contains(word.substring(counter,counter+2)))
                    {
                        counter+=2;

                        continue;
                    }
                }
                yesOrNo=false;
                break;
            }
            System.out.println(yesOrNo? "yes":"no");
        }
    }
}
