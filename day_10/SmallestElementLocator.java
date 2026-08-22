import java.util.*;
public class SmallestElementLocator{
  public static void main(String[] args) {
    int[] arr= {1, 4, 7, 4, 6, 9, 3, 10};
    int[] ans= findMinWithIndex(arr);
    System.out.print(Arrays.toString(ans));
  }
  static int[] findMinWithIndex(int[]arr){
    int min= Integer.MAX_VALUE, index= 0;
    for (int i=0; i<arr.length; i++){
      if (arr[i]<min)
        min= arr[i];
        index= i;
    }
    return new int[] {min, index};
  }
}