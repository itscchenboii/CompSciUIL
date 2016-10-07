import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by chenc on 10/5/2016.
 */
public class gender_race2
{
    public static void main(String[] args) throws IOException
    {
        Scanner in = new Scanner(new File("gender_race.dat"));

        int sets = Integer.parseInt(in.nextLine().trim());
        ArrayList<Racer>arrayList=new ArrayList<>();

        while(sets-->0)
        {
            String[]array = in.nextLine().trim().split(" ");
            arrayList.add(new Racer(array[0],Integer.parseInt(array[1]),array[2]));
        }

        ArrayList<Racer>boys=new ArrayList<>();
        ArrayList<Racer>girls=new ArrayList<>();

        for (int i = 0; i < arrayList.size(); i++) {
            if(arrayList.get(i).gender.equals("M")) boys.add(arrayList.get(i));
            else girls.add(arrayList.get(i));
        }

        Collections.sort(arrayList);
        Collections.sort(boys);
        Collections.sort(girls);

        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(1));
        System.out.println(boys.get(0));
        System.out.println(boys.get(1));
        System.out.println(girls.get(0));
        System.out.println(girls.get(1));
    }
}

class Racer implements Comparable
{
    public String name;
    public int time;
    public String gender;

    public Racer(String n, int t, String string)
    {
        name= n;
        time = t;
        gender = string;
    }

    public int compareTo(Object o)
    {
        Racer r = (Racer)o;

        if(this.time>r.time) return 1;
        else if(this.time == r.time) return 0;
        else return -1;
    }

    public String toString()
    {
        return name+" "+time+" "+gender;
    }
}
