import java.util.Scanner;
/**
 * Tic-Tac-Toe: Two-player console, non-graphics, non-OO version.
 * All variables/methods are declared as static (belong to the class)
 *  in the non-OO version.
 */
public class Main {

  public static final int EMPTY = 0;
  public static final int CROSS = 1;
  public static final int ZERO = 2;

  public static void printBoard() {

    int columns = 3;
    int rows = 3;
    
    int[][] grid = new int[rows][columns];
    
    for (int i = 0; i < grid.length; i++)
    {
        for (int j = 0; j < grid.length; j++)
        {
            grid[i][j] = 0;
            System.out.print(grid[i][j] + " ");
        }
        System.out.println();
    }

    // Reset GameBoard
    public static void startGame() {
      for (int row = 0; row < ROWS; ++row){
        for (int col = 0; col < COLS; ++col) {
          board[rows][columns] = EMPTY;
        }
      }

    }


  }
}

//  |   |   |   |
//  -------------
//  |   |   |   |
//  -------------
//  |   |   |   |