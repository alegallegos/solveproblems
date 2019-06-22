//Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
//You may assume that the array is non-empty and the majority element always exist in the array.

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

  public int process(int array[]) {

    int i = 0;
    int goal = array.length / 2;

    Map<Integer, Integer> count = new HashMap<>();

    while (i < array.length) {

      int value = array[i];
      int actualCount = 1;

      if (count.containsKey(value)) {
        actualCount = count.get(value) + 1;
      }

      count.put(value, actualCount);

      if (actualCount > goal) {
        return value;
      }

      i++;
    }

    return -1;
  }

}
