import java.util.*;
public class PlaylistOrderReverser{
  public static void main(String[] args) {
    int[] arr= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    System.out.println("Original array: ");
    for (int ele:arr){
      System.out.printf("%d ", ele);
    }
    System.out.println();
    reverse(arr);
  }
  static void reverse(int[]arr){
    int start= 0;
    int end= arr.length-1;
    while(start<end){
      swap(arr, start, end);
      start++;
      end--;
    }
    System.out.println("Reversed array: ");
    for (int ele:arr){
      System.out.printf("%d ", ele);
    }
  }
  static void swap(int[]arr, int start, int end){
    int temp= arr[start];
    arr[start]= arr[end];
    arr[end]= temp;
  }
}