//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

      String[][] board = {
              {"-", "-", "-"},
              {"-","-", "-"},
              {"-", "-", "-"}};
      boolean winner = false;
      while (!winner) {
          drawBoard(board);
          getInputX(board);
          winner = checkWin(board);
          if (winner) {
              drawBoard(board);
              break;
          }
          drawBoard(board);
          getInputO(board);
          winner = checkWin(board);
      }
      System.out.println("Winner!");


    }
    public static boolean checkWin(String[][] board) {
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != "-") {
            return true;
        } else if (board[0][0] == board[0][1] && board[0][1] == board[0][2] && board[0][0] != "-") {
            return true;
        }else if (board[1][0] == board[1][1] && board[1][1] == board[1][2] && board[1][0] != "-") {
            return true;
        }else if (board[2][0] == board[2][1] && board[2][1] == board[2][2] && board[2][0] != "-") {
            return true;
        } else if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != "-") {
            return true;
        }else if (board[0][0] == board[1][0] && board[1][0] == board[2][0] && board[0][0] != "-") {
            return true;
        } else if (board[0][1] == board[1][1] && board[1][1] == board[2][1] && board[0][1] != "-") {
            return true;
        }else return board[0][2] == board[1][2] && board[1][2] == board[2][2] && board[0][2] != "-";

    }
    public static void getInputX(String[][] board) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        int rowInput = sc.nextInt() - 1;
        int colInput = sc.nextInt() - 1;
        board[rowInput][colInput] = "X";
    }
    public static void getInputO(String[][] board) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        int rowInput = sc.nextInt() - 1;
        int colInput = sc.nextInt() - 1;
        board[rowInput][colInput] = "O";
    }
    public static void drawBoard(String[][] board) {
        for (String[] row : board) {
            System.out.println();
            for (String cell : row) {
                System.out.print(cell + "|");
            }
        }
        System.out.println();
        System.out.print("======");
    }
}

