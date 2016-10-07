import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by chenc on 9/22/2016.
 */
public class Puddle {

    public static char[][]map;
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("puddle.dat"));

        String []array = in.nextLine().trim().split(" ");
        map = new char[Integer.parseInt(array[1])][Integer.parseInt(array[0])];

        for (int i = 0; i < map.length; i++) {
            char[]input = in.nextLine().toCharArray();
            for (int j = 0; j < map[i].length; j++) {
                map[i][j] = input[j];
            }
        }

        int sets = Integer.parseInt(in.nextLine().trim());

        while(sets-->0)
        {
            String[]input = in.nextLine().trim().split(" ");
            if(map[Integer.parseInt(input[0])][Integer.parseInt(input[1])]=='G')
            {
                System.out.println("OK");
                continue;
            }
            else if(map[Integer.parseInt(input[0])][Integer.parseInt(input[1])]=='R' || map[Integer.parseInt(input[0])][Integer.parseInt(input[1])]=='S')
            {
                System.out.println("OOPS");
                continue;
            }
            else
            {
                System.out.println("PUDDLE");
                freezeWater(Integer.parseInt(input[0]),Integer.parseInt(input[1]),map);
            }

        }

        for(char[]i:map)
        {
            for(char j : i)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void freezeWater(int row, int column, char[][]map)
    {
        if(map[row][column]=='W') map[row][column]='F';
        if(row - 1 >=0 && column-1>=0) {
            if (map[row][column + 1] == 'W' && column + 1 < map[0].length) freezeWater(row, column + 1, map);
            if (map[row + 1][column] == 'W' && row + 1 < map.length) freezeWater(row + 1, column, map);
            if (map[row - 1][column] == 'W') freezeWater(row - 1, column, map);
            if (map[row][column - 1] == 'W') freezeWater(row, column - 1, map);
        }
    }
}
