import org.junit.Test;

public class ConvertSortedArrayToBinarySearchTreeTest {

  @Test
  public void testConvert() {
    ConvertSortedArrayToBinarySearchTree convert = new ConvertSortedArrayToBinarySearchTree();

    int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    System.out.println(convert.process(nums).toString());
  }

}