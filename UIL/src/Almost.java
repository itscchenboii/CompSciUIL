import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Almost
{
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("almost.dat"));
        int sets = Integer.parseInt(in.nextLine().trim());
        while(sets-->0) {
            char[][]ticTacToe = new char[3][3];
            for (int i = 0; i < 3; i++) {
                char [] row = in.nextLine().toCharArray();
                for (int j = 0; j < 3; j++) {
                    ticTacToe[i][j] = row[j];
                }
            }

            checkingHorizontal : for (int i = 0; i < 3; i++) {
                if(ticTacToe[i][0]=='X'&&ticTacToe[i][1]=='X' && ticTacToe[i][2]==' ')
                {
                    System.out.println((i+1)+ " " + 3);
                    break checkingHorizontal;
                }
                else if(ticTacToe[i][1] == 'X' && ticTacToe[i][2]=='X'&& ticTacToe[i][0]==' ')
                {
                    System.out.println((i+1)+ " " + 1);
                    break checkingHorizontal;
                }
                else if(ticTacToe[i][0] == 'X' && ticTacToe[i][2]=='X'&& ticTacToe[i][1]==' ')
                {
                    System.out.println((i+1)+ " " + 2);
                    break checkingHorizontal;
                }
            }

            checkingVertical : for (int i = 0; i < 3; i++) {
                if(ticTacToe[0][i] == 'X' && ticTacToe [1][i]=='X'&& ticTacToe[2][i]==' ')
                {
                    System.out.println(3 + " " + (i+1));
                    break checkingVertical;
                }
                else if(ticTacToe[1][i]=='X' && ticTacToe[2][i] == 'X'&& ticTacToe[0][i]==' ')
                {
                    System.out.println(1 + " " + (i+1));
                    break checkingVertical;
                }
                else if(ticTacToe[0][i]=='X' && ticTacToe[2][i] == 'X'&& ticTacToe[1][i]==' ')
                {
                    System.out.println(2 + " " + (i+1));
                    break checkingVertical;
                }
            }

            CheckingDiagonal1 : for (int i = 0; i < 2; i++) {
                    if(ticTacToe[0][0]=='X' && ticTacToe[1][1]=='X'&& ticTacToe[2][2]==' ') {
                        System.out.println(3 + " " +3);
                        break CheckingDiagonal1;
                    }
                    else if(ticTacToe[1][1]=='X' && ticTacToe[2][2]=='X'&& ticTacToe[0][0]==' '){
                        System.out.println(1 + " " +1);
                        break CheckingDiagonal1;
                    }
                    else if(ticTacToe[0][0]=='X' && ticTacToe[2][2]=='X'&& ticTacToe[1][1]==' ')
                    {
                        System.out.println(2 + " " +2);
                        break CheckingDiagonal1;
                    }
            }

            CheckingDiagonal2 : for (int i = 0; i < 2; i++) {
                if(ticTacToe[0][2]=='X' && ticTacToe[1][1]=='X'&& ticTacToe[2][0]==' ') {
                    System.out.println(3 + " " +3);
                    break CheckingDiagonal2;
                }
                else if(ticTacToe[1][1]=='X' && ticTacToe[2][0]=='X'&& ticTacToe[0][2]==' '){
                    System.out.println(1 + " " +3);
                    break CheckingDiagonal2;
                }
                else if(ticTacToe[0][2]=='X' && ticTacToe[2][0]=='X'&& ticTacToe[1][1]==' ')
                {
                    System.out.println(2 + " " +2);
                    break CheckingDiagonal2;
                }
            }
            }

        }
    }

