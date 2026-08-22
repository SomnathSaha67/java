import java.util.*;
public class BinarySearchElementFinder{
  public static void main(String[]args){
    int[] arr= {1, 3, 4, 5, 7, 8, 10, 12, 15, 18, 19, 19, 21};
    int target= 3;
    System.out.print(binarySearch(arr, target));
  }
  static int binarySearch(int[]arr, int target){
    int start=0, end= arr.length-1, c=0;
    while(start<=end){
      c+=1;
      int mid= start+(end-start)/2;
      if (arr[mid]==target){
        return mid;
      }
        if (arr[start]<arr[end]){
          if (target<arr[mid]){
            end= mid-1;
          }else{
            start=mid+1;
          }
        }else{
          if (target<arr[mid]){
            start=mid+1;
          }else{
            end=mid-1;
          }
        }
    }
    return -1;
  }
}