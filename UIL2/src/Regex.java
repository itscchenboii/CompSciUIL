/**
 * Created by chenc on 10/6/2016.
 */
public class Regex
{
    public static void main(String[] args)
    {
        String test = "the crazy guy jumped over my dog";

        String[]array= test.split("(\\b\\s*(\\w{3})\\s*\\b)|\\s");

        for (int i = 0; i < array.length; i++)
        {
            if(array[i].length()>0)
            System.out.println(array[i]);
        }
    }
}
