public class App {

  public static void main(String args[]) {
//    AddDigits addDigits = new AddDigits();
//    System.out.println(addDigits.process(38));

//    MajorityElement majorityElement = new MajorityElement();
//    int[] array = {1,2,2,3};
//    System.out.println(majorityElement.process(array));

    int[] array = {1,2,2,1};

    System.out.println(ContainsDuplicateII.process(array, 2));
    System.out.println(ContainsDuplicateII.processWithMap(array, 2));

    int[] array2 = {1,2,3,1};
    System.out.println(ContainsDuplicateII.process(array2, 2));
    System.out.println(ContainsDuplicateII.processWithMap(array2, 2));

  }

}
