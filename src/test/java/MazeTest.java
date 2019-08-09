import org.junit.Test;

import static org.junit.Assert.*;

public class MazeTest {

  @Test
  public void solve() {
    int[][] matrix = {
            {0,0,0,1,0},
            {1,0,1,0,0},
            {0,0,1,0,1},
            {0,1,0,0,0},
            {0,0,0,1,2}
    };
    Maze maze = new Maze(matrix);
    maze.solve();
  }
}