public class SearchInsertPositionFinder{
  public static void main(String[] args) {
    int[] arr= {1, 3, 4, 5, 7, 8, 10, 12, 15, 18, 19, 19, 21};
    int target= 2;
    System.out.print(searchPosition(arr, target));
  }
  static int searchPosition(int[]arr, int target){
    int start= 0, end= arr.length-1;
    while (start<=end){
      int mid= start+(end-start)/2;
      if (target==arr[mid]){
        return mid;
      }
      if (target>arr[mid])
        start= mid+1;
      else
        end= mid-1;
    }
    return start;
  }
}