//Given an array of integers, find if the array contains any duplicates. Your function should return
//true if any value appears at least twice in the array, and it should return false if every element is distinct.

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {

  public boolean containsDuplicate(int array[]) {

    for (int i = 0; i < array.length; i++) {
      int actual = array[i];
      for (int j = 0; j < array.length; j++) {
        if(actual == array[j] && i != j) {
          return true;
        }
      }
    }
    return false;
  }
}
