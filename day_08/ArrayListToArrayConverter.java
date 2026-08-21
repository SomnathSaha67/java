import java.util.*;
public class ArrayListToArrayConverter{
  public static void main(String[] args) {
    ArrayList<Integer> numbers= new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
    Integer[] arr= numbers.toArray(new Integer[0]);
    for (int ele:arr){
      System.out.printf("%d ", ele);
    }
  }
}