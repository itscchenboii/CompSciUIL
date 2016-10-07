import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class War {
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(new File("war.dat"));
        int sets = Integer.parseInt(in.nextLine());
        while(sets-->0)
        {
            String[] input = in.nextLine().trim().split(" ");
            int []player1Deck = new int[15];
            for (int i = 0; i < 15; i++) {
                String card = input[i];
                if(card.equals("J"))
                {
                    player1Deck[i]=11;
                    continue;
                }
                if(card.equals("Q"))
                {
                    player1Deck[i]=12;
                    continue;
                }
                if(card.equals("K"))
                {
                    player1Deck[i]=13;
                    continue;
                }
                if(card.equals("A"))
                {
                    player1Deck[i]=14;
                    continue;
                }
                player1Deck[i]=Integer.parseInt(card);
            }

            input = in.nextLine().trim().split(" ");
            int []player2Deck = new int[15];
            for (int i = 0; i < 15; i++) {
                String card = input[i];
                if(card.equals("J"))
                {
                    player2Deck[i]=11;
                    continue;
                }
                if(card.equals("Q"))
                {
                    player2Deck[i]=12;
                    continue;
                }
                if(card.equals("K"))
                {
                    player2Deck[i]=13;
                    continue;
                }
                if(card.equals("A"))
                {
                    player2Deck[i]=14;
                    continue;
                }
                player2Deck[i]=Integer.parseInt(card);
            }

            int player1Winning = 0;
            int player2Winning = 0;
            int counter = 0;
            int pile = 2;

            while(counter < 15)
            {
                if(player1Deck[counter]>player2Deck[counter])
                {
                    player1Winning+=pile;
                    pile = 2;
                }
                else if(player2Deck[counter]>player1Deck[counter])
                {
                    player2Winning+=pile;
                    pile = 2;
                }
                else
                {
                    counter+=3;
                    pile+=8;
                }
                counter++;
            }
            System.out.println(player1Winning+ " " + player2Winning);
        }
    }
}