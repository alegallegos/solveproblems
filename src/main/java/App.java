public class App {

  public static void main(String args[]) {
//    AddDigits addDigits = new AddDigits();
//    System.out.println(addDigits.process(38));

//    MajorityElement majorityElement = new MajorityElement();
//    int[] array = {1,2,2,3};
//    System.out.println(majorityElement.process(array));

//    AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
//    int[] nums1 = {2 ,4, 3};
//    AddTwoNumbers.ListNode list1 = addTwoNumbers.createList(nums1);
//    int[] nums2 = {5, 6, 4};
//    AddTwoNumbers.ListNode list2 = addTwoNumbers.createList(nums2);
//
//    System.out.println(addTwoNumbers.process(list1, list2));

    ContainsDuplicate containsDuplicate = new ContainsDuplicate();
    int[] array = {0,2,6,4,2,8,9,1};
    System.out.println(containsDuplicate.containsDuplicate(array));
    System.out.println(containsDuplicate.containsDuplicate2(array));
  }

}
