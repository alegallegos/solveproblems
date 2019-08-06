import org.junit.Test;

import static org.junit.Assert.*;

public class QuickSelectTest {

  @Test
  public void testSelect() {
    int[] nums = {2, 3, 7 ,1, -2 , 8};

    QuickSelect quickSelect = new QuickSelect(nums);

    assertEquals(7,  quickSelect.select(2));
  }

}