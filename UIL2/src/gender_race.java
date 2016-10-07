import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by chenc on 9/29/2016.
 */
public class gender_race
{
    public static void main(String[] args) throws IOException
    {
        Scanner in = new Scanner(new File("gender_race.dat"));

        int sets = Integer.parseInt(in.nextLine().trim());
        ArrayList <String[]> racers = new ArrayList<>();

        while(sets-->0)
        {
            String[]array = in.nextLine().trim().split(" ");

            racers.add(array);
        }

        int bestOverall = 0;
        int secondBest = 0;
        for (int i = 1; i < racers.size(); i++)
        {
            if(Integer.parseInt(racers.get(i)[1])<Integer.parseInt(racers.get(bestOverall)[1]))
            {
                secondBest = bestOverall;
                bestOverall = i;
            }
        }


        System.out.println(racers.get(bestOverall)[0]+ " " + racers.get(bestOverall)[1]+" "+racers.get(bestOverall)[2]);
        System.out.println(racers.get(secondBest)[0]+ " " + racers.get(secondBest)[1]+" "+racers.get(secondBest)[2]);
        System.out.println(racers.get(findBestGender(racers, "M"))[0]+ " " + racers.get(findBestGender(racers, "M"))[1]+" "+racers.get(findBestGender(racers, "M"))[2]);
        System.out.println(racers.get(findSecondGender(racers, "M"))[0]+ " " + racers.get(findSecondGender(racers, "M"))[1]+" "+racers.get(findSecondGender(racers, "M"))[2]);
        System.out.println(racers.get(findBestGender(racers, "F"))[0]+ " " + racers.get(findBestGender(racers, "F"))[1]+" "+racers.get(findBestGender(racers, "F"))[2]);
        System.out.println(racers.get(findSecondGender(racers, "F"))[0]+ " " + racers.get(findSecondGender(racers, "F"))[1]+" "+racers.get(findSecondGender(racers, "F"))[2]);
    }

    public static int findBestGender(ArrayList<String[]>list, String gender)
    {
        int bestFemale = 0;
        int secondFemale = 0;
        boolean first1 = true;
        for (int i = 0; i < list.size(); i++)
        {
            if(list.get(i)[2].equals(gender))
            {
                if(first1)
                {
                    bestFemale = i;
                    first1 = false;
                }
                else if(Integer.parseInt(list.get(i)[1])<Integer.parseInt(list.get(bestFemale)[1]))
                {
                    secondFemale = bestFemale;
                    bestFemale = i;
                }
                else if(Integer.parseInt(list.get(i)[1])<Integer.parseInt(list.get(secondFemale)[1]))
                {
                    secondFemale = i;
                }
            }
        }
        return bestFemale;
    }

    public static int findSecondGender(ArrayList<String[]>list, String gender)
    {
        int bestFemale = 0;
        int secondFemale = 0;
        boolean first1 = true;
        for (int i = 0; i < list.size(); i++)
        {
            if(list.get(i)[2].equals(gender))
            {
                if(first1)
                {
                    bestFemale = i;
                    first1 = false;
                }
                else if(Integer.parseInt(list.get(i)[1])<Integer.parseInt(list.get(bestFemale)[1]))
                {
                    secondFemale = bestFemale;
                    bestFemale = i;
                }
                else if(Integer.parseInt(list.get(i)[1])<Integer.parseInt(list.get(secondFemale)[1]))
                {
                    secondFemale = i;
                }
            }
        }
        return secondFemale;
    }
}