public class Maze {

  private static final int EXIT = 2;
  private static final int WALL = 1;
  private int[][] maze;
  private int[][] moves;
  private int[][] posibleMoves = {{0, 1}, {1, 0}, {-1, 0}, {0, -1}};

  public Maze(int[][] maze) {
    this.maze = maze;
    //we assume square maze and starting point (0,0)
    this.moves = new int[maze.length][maze.length];
    this.moves[0][0] = 1;
  }

  public void solve() {
    if (move(0, 0)) {
      showMoves();
    } else {
      System.out.println("There is no solution.");
    }
  }

  private boolean move(int x, int y) {
    if (maze[x][y] == Maze.EXIT) { //we solved the maze
      return true;
    }

    for (int i = 0; i < posibleMoves.length; i++) {
      int nextX = x + posibleMoves[i][0];
      int nextY = y + posibleMoves[i][1];
      if(canMove(nextX, nextY)){
        moves[nextX][nextY] = 1;
        if(move(nextX, nextY)) {
          return true;
        } else {
          moves[nextX][nextY] = 0;
        }
      }
    }

    return false;
  }

  private boolean canMove(int x, int y) {
    //check if we are inside the maze
    if(x < 0 || x >= maze.length || y < 0 || y >= maze.length) {
      return false;
    }

    //1st condition: there is no wall
    if(maze[x][y] == WALL) {
      return false;
    }
    //2nd condition: we haven't been there yet
    if(moves[x][y] == 1) {
      return false;
    }

    return true;
  }

  private void showMoves() {
    for (int i = 0; i < maze.length; i++) {
      for (int j = 0; j < maze.length; j++) {
        if (moves[i][j] == 1) {
          System.out.print("0 ");
        } else if(maze[i][j] == WALL){
          System.out.print("# ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }
  }
}
