import java.util.*;
public class FirstLast{
  public static void main(String[] args) {
    int arr[]= {1, 2, 3, 4, 4, 4, 5, 6, 7, 7, 7, 8, 9, 10, 10, 10 , 10 ,10, 11, 11, 12};
    System.out.print(Arrays.toString(gatherValues(arr, 10)));
  }
  static int[] gatherValues(int[]arr, int target){
    int[] ans= {-1, -1};
    ans[0]= findIndex(arr, target, true);
    ans[1]= findIndex(arr, target, false);
    return ans;
  }
  static int findIndex(int[]arr, int target, boolean findFirstIndex){
    int ans=-1, start=0, end= arr.length-1;
    while(start<=end){
      int mid= start+(end-start)/2;
      if (target<arr[mid])
        end= mid-1;
      else if (target>arr[mid])
        start= mid+1;
      else{
        ans= mid;
        if (findFirstIndex)
          end= mid-1;
        else
          start= mid+1;
      }
    }
    return ans;
  }
}