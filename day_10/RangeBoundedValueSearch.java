import java.util.*;
public class RangeBoundedValueSearch{
  public static void main(String[] args) {
    int[] arr= {1, 4, 7, 4, 6, 9, 3, 10}; int start= 2, end= 6, target= 10;
    System.out.print(searchInRange(arr, target, start, end));
  }
  static int searchInRange(int[]arr, int target, int start, int end){
    for (int i=start; i<end; i++){
      if (target==arr[i])
        return i;
    }
    return -1;
  } 
}