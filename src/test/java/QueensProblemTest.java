import org.junit.Test;

import static org.junit.Assert.*;

public class QueensProblemTest {

  @Test
  public void solve() {
    QueensProblem queensProblem = new QueensProblem(4);

    assertTrue(queensProblem.solve());
  }

  @Test
  public void noSolution() {
    QueensProblem queensProblem = new QueensProblem(3);

    assertFalse(queensProblem.solve());
  }
}