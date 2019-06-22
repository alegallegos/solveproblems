// You are given two non-empty linked lists representing two non-negative integers.
// The digits are stored in reverse order and each of their nodes contain a single digit.
// Add the two numbers and return it as a linked list.

// You may assume the two numbers do not contain any leading zero, except the number 0 itself.

// Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
// Output: 7 -> 0 -> 8

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
public class AddTwoNumbers {

  public ListNode process(ListNode list1, ListNode list2) {

    int first = procesNodes(list1, 1);
    int second = procesNodes(list2, 1);

    int result = first + second;

    ListNode firstNode = new ListNode(result % 10);
    result /= 10;
    ListNode autNode = firstNode;


    while (result > 0) {
      autNode.next = new ListNode(result % 10);
      autNode = autNode.next;
      result = result / 10;
    }

    return firstNode;

  }

  private int procesNodes(ListNode node, int level) {

    if (node.next == null) {
      return node.val * level;
    }

    return  node.val * level + procesNodes(node.next, level * 10);
  }

  public ListNode createList(int nums[]) {
    ListNode firsttNode = new ListNode(nums[0]);
    ListNode auxNode = firsttNode;
    for (int i = 1; i < nums.length; i++) {
      auxNode.next = new ListNode(nums[i]);
      auxNode = auxNode.next;
    }

    return firsttNode;
  }

  public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
    }

    @Override
    public String toString() {
      if (next == null) return String.valueOf(val);
      return val + "->" + next.toString();
    }
  }

}
