// Given an array where elements are sorted in ascending order, convert it to a height balanced BST.

import sun.reflect.generics.tree.Tree;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */

public class ConvertSortedArrayToBinarySearchTree {

  TreeNode process(int[] nums) {

    if (nums == null || nums.length == 0){
      return null;
    }

    TreeNode root = helper(nums, 0, nums.length - 1);

    return root;
  }

  private TreeNode helper(int[] nums, int start, int end) {
    TreeNode node = null;

    if (start <= end) {
      int mid = (start + end) / 2;
      node = new TreeNode(nums[mid]);
      node.left = helper(nums, start, mid - 1);
      node.right = helper(nums, mid + 1, end);
    }

    return node;
  }

  public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
      val = x;
    }

    public String toString() {
      StringBuilder buffer = new StringBuilder(50);
      print(buffer, "", "");
      return buffer.toString();
    }

    private void print(StringBuilder buffer, String prefix, String childrenPrefix) {
      buffer.append(prefix);
      buffer.append(val);
      buffer.append('\n');
      if (left != null) {
        left.print(buffer, childrenPrefix + "├── ", childrenPrefix + "│   ");
      }
      if (right != null) {
        right.print(buffer, childrenPrefix + "└── ", childrenPrefix + "    ");
      }

    }
  }
}

