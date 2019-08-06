import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

//Given an array of integers and an integer k, find out whether there are two distinct indices i and
//j in the array such that nums[i] = nums[j] and the absolute difference between i and j is at most k.
public class ContainsDuplicateII {

  public static boolean process(int[] nums, int k) {
    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] == nums[j] && Math.abs(i - j) <= k) {
          return true;
        }
      }
    }
    return false;
  }

  /**
   * Faster but uses more memory
   *
   * @param nums
   * @param k
   * @return
   */
  public static boolean processWithMap(int[] nums, int k) {
    Map<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      int current = nums[i];
      if (map.containsKey(current) && i - map.get(current) <= k) {
        return true;
      } else {
        map.put(current, i);
      }
    }
    return false;
  }


}
