import java.util.*;
public class TwoDArraySortedSearch{
  public static void main(String[] args) {
    int[][] arr= {{10, 20, 30, 40},
                  {11, 25, 35, 45},
                  {28, 29, 37, 49},
                  {33, 34, 38, 50}};
    System.out.print(search(arr, 7));
  }
  static boolean search(int[][]arr, int target){
    int ele= -1;
    for (int[]row:arr){
      ele= binarySearch(row, target);
      if (target<row[0] || target>row[row.length-1])
        continue;
      if (ele!=-1)
        return true;
    }
    return false;
  }
  static int binarySearch(int[]arr, int target){
    int start=0, end= arr.length-1;
    while(start<=end){
      int mid= start+(end-start)/2;
      if(target<arr[mid])
        end= mid-1;
      else if(target>arr[mid])
        start=mid+1;
      else
        return mid;
    }
    return -1;
  }
}