import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by chenc on 10/5/2016.
 */
public class mazemap
{
    public static void main(String[] args) throws IOException
    {
        Scanner in = new Scanner(new File("mazemap.dat"));

        int sets = Integer.parseInt(in.nextLine().trim());

        while(sets-->0)
        {
            String[]array = in.nextLine().trim().split(" ");

            int dimension = Integer.parseInt(array[0]);

            String row = array[1];

            for (int i = 0; i < row.length(); i++) {
                int binary = Integer.decode("0x"+row.substring(i,i+1));
                String number = Integer.toBinaryString(binary);
                if(number.length() == 3) number="0"+number;
                else if(number.length()==2) number="00"+number;
                else if(number.length()==1) number ="000"+number;
                else if(number.length()==0)number = "0000";
                while(number.length()<dimension-1 && i+1 < row.length())
                {
                    binary = Integer.decode("0x"+row.substring(++i,i+1));
                    String addOn = Integer.toBinaryString(binary);
                    if(addOn.length() == 3) addOn="0"+addOn;
                    else if(addOn.length()==2) addOn="00"+addOn;
                    else if(addOn.length()==1) addOn ="000"+addOn;
                    else if(addOn.length()==0)addOn = "0000";
                    number+=addOn;
                }

                System.out.print(number.substring(0,dimension-1) + " ");
            }

            System.out.println();
            String col = array[2];

            for (int i = 0; i < col.length(); i++) {
                int binary = Integer.decode("0x"+col.substring(i,i+1));
                String number = Integer.toBinaryString(binary);
                if(number.length() == 3) number="0"+number;
                else if(number.length()==2) number="00"+number;
                else if(number.length()==1) number ="000"+number;
                else if(number.length()==0)number = "0000";
                while(number.length()<dimension-1 && i+1 < row.length())
                {
                    binary = Integer.decode("0x"+col.substring(++i,i+1));
                    String addOn = Integer.toBinaryString(binary);
                    if(addOn.length() == 3) addOn="0"+addOn;
                    else if(addOn.length()==2) addOn="00"+addOn;
                    else if(addOn.length()==1) addOn ="000"+addOn;
                    else if(addOn.length()==0)addOn = "0000";
                    number+=addOn;
                }

                System.out.print(number.substring(0,dimension-1) + " ");
            }
            System.out.println();
            System.out.println();


        }

    }
}
