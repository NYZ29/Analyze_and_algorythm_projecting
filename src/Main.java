import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("INPUT.TXT"));
        PrintWriter out = new PrintWriter(new FileWriter("OUTPUT.TXT"));

        char[][] ticTacToe = new char[3][3];
        char winner = '.';

        for (int i = 0; i < 3; i++) {
            String line = in.nextLine();
            for (int j = 0; j < 3; j++) {
                ticTacToe[i][j] = line.charAt(j);
            }
        }

        for (int i = 0; i < 3 && winner == '.'; i++) {
            if (ticTacToe[i][0] == ticTacToe[i][1] && ticTacToe[i][0] == ticTacToe[i][2]) winner = ticTacToe[i][0];
        }

        for (int j = 0; j < 3 && winner == '.'; j++) {
            if (ticTacToe[0][j] == ticTacToe[1][j] && ticTacToe[0][j] == ticTacToe[2][j]) winner = ticTacToe[0][j];
        }

        if (ticTacToe[0][0] == ticTacToe[1][1] && ticTacToe[0][0] == ticTacToe[2][2]) winner = ticTacToe[0][0];
        else if (ticTacToe[0][2] == ticTacToe[1][1] && ticTacToe[0][2] == ticTacToe[2][0]) winner = ticTacToe[0][2];

        String answer = "Draw";

        if (winner == 'X') answer = "Win";
        else if (winner == 'O') answer = "Lose";

        out.println(answer);
        out.close();
    }
}