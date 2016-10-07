import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


/**
 * Created by chenc on 9/30/2016.
 */
public class Snapshot
{
    public static int counter;
    public static void main(String[] args) throws IOException
    {
        Scanner in = new Scanner(new File("snapshot.dat"));
        ArrayList<Classroom> classrooms = new ArrayList<>();
        counter = 0;

        while(in.hasNextLine())
        {
            String [] array = in.nextLine().trim().split(" ");
            Classroom classroom = new Classroom(Integer.parseInt(array[0]), Integer.parseInt(array[1]), Integer.parseInt(array[2]),counter);
            counter++;
            classrooms.add(classroom);
        }

        int total = 0;
        for(Classroom c : classrooms)
        {
            total+=c.total;
        }
        System.out.println(total);

        int tardies = 0;
        for(Classroom c : classrooms)
        {
            tardies += c.tardy;
        }
        System.out.println(tardies);

        int highest = 0;
        for (int i = 1; i < classrooms.size(); i++) {
            if(classrooms.get(i).compareTo(classrooms.get(highest)) == -1)
            {
                highest = i;
            }
        }
        System.out.println(highest+1);

        Collections.sort(classrooms);
        for (int i = 0; i < classrooms.size(); i++) {
            System.out.print(classrooms.get(i).index + " ");
        }

    }
}

class Classroom implements Comparable
{
    public int total;
    public int absent;
    public int tardy;
    public int index;

    public Classroom(int to, int a, int ta, int i)
    {
        total = to;
        absent = a;
        tardy = ta;
        index =i +1;
    }

    public int getAbsent() {
        return absent;
    }

    public int compareTo(Object c)
    {
        Classroom cl = (Classroom)c;
        if(this.absent>cl.absent)
        {
            return 1;
        }
        else if(this.absent==cl.absent)
        {
            return 0;
        }
        else return -1;
    }
}
