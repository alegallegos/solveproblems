import java.util.Random;

public class QuickSelect {
  private final int[] nums;

  public QuickSelect(int[] nums) {
    this.nums = nums;
  }

  public int select(int k) {
    return selection(0, nums.length - 1, k - 1);
  }

  private int selection(int firstIndex, int lastIndex, int k) {
    int pivot = partition(firstIndex, lastIndex);

    if (pivot > k) {
      return selection(firstIndex, pivot - 1, k);
    } else if (pivot < k) {
      return selection(pivot + 1, lastIndex, k);
    }

    return nums[k];
  }

  private int partition(int firstIndex, int lastIndex) {
    int pivot = firstIndex + new Random().nextInt(lastIndex - firstIndex + 1);
    swap(pivot, lastIndex);

    for (int i = firstIndex; i < lastIndex; i++) {
      if(nums[i] > nums[lastIndex]) {
        swap(i, firstIndex);
        firstIndex++;
      }
    }

    swap(firstIndex, lastIndex);

    return firstIndex;
  }

  private void swap(int indexA, int indexB) {
    int temp = nums[indexA];
    nums[indexA] = nums[indexB];
    nums[indexB] = temp;
  }
}
