import org.junit.Test;

import static org.junit.Assert.*;

public class HamiltonianCycleTest {

  @Test
  public void testNoSolution() {
    int[][] mastrix = {
            {0, 1, 0},
            {1, 0, 1},
            {0, 1, 0}
    };
    HamiltonianCycle hamiltonianCycle = new HamiltonianCycle(mastrix);
    hamiltonianCycle.solve();
  }

  @Test
  public void testOK() {
    int[][] mastrix = {
            {0, 1, 0, 1, 0, 0},
            {1, 0, 1, 0, 0, 0},
            {0, 1, 0, 1, 1, 0},
            {1, 0, 1, 0, 1, 1},
            {0, 0, 1, 1, 0, 1},
            {1, 0, 0, 1, 1, 0}
    };
    HamiltonianCycle hamiltonianCycle = new HamiltonianCycle(mastrix);
    hamiltonianCycle.solve();
  }

}