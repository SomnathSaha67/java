import java.util.*;
public class SecondHighestScoreFinder{
  public static void main(String[] args) {
    int[] arr= {1, 2, 3, 9, 5, 6, 8, 7, 10};
    System.out.printf("Second highest number in %s: %d", Arrays.toString(arr), findSecondLargest(arr));
  }
  static int findSecondLargest(int[] arr){
    int max= arr[0];
    int maxSecond= arr[0];
    for (int ele:arr){
      if (ele>max){
        maxSecond= max;
        max= ele;
      }else if(ele>maxSecond && ele!=max){
        maxSecond= ele;
      }
    }
    return maxSecond;
  }
}