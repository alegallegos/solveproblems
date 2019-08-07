// Place N queens in an N sized chess table, so that non of them can attack each other.

public class QueensProblem {

  private int[][] chessTable;
  private int numQueens;

  public QueensProblem(int numQueens) {
    this.chessTable = new int[numQueens][numQueens];
    this.numQueens = numQueens;
  }

  public boolean solve() {
    boolean result = setQueens(0);
    if (result) {
      print();
    } else {
      System.out.println("There is no solution.");
    }
    return result;
  }

  private boolean setQueens(int colIndex) {
    if (colIndex == numQueens) { //we reached the end with solutions for each column
      return true;
    }

    for (int rowIndex = 0; rowIndex < numQueens; rowIndex++) {
      if (isValidPosition(rowIndex, colIndex)) {
        chessTable[rowIndex][colIndex] = 1;
        if (setQueens(colIndex + 1)) { //check next columns
          return true;
        }
        chessTable[rowIndex][colIndex] = 0; //we need to backtrack and check the next row
      }
    }

    return false; //we checked all the columns and there was no solution
  }

  private boolean isValidPosition(int rowIndex, int colIndex) {
    for (int i = 0; i < colIndex; i++) {
      if (chessTable[rowIndex][i] == 1) {
        return false;
      }
    }

    for (int i = rowIndex, j = colIndex; i >= 0 && j >= 0; i--, j--) {
      if (chessTable[i][j] == 1) {
        return false;
      }
    }

    for (int i = rowIndex, j = colIndex; i < numQueens && j >= 0; i++, j--) {
      if (chessTable[i][j] == 1) {
        return false;
      }
    }

    return true;
  }

  public void print() {
    for (int i = 0; i < numQueens; i++) {
      for (int j = 0; j < numQueens; j++) {
        if (chessTable[i][j] == 1) {
          System.out.print(" Q ");
        } else {
          System.out.print(" - ");
        }
      }
      System.out.println();
    }
  }


}
