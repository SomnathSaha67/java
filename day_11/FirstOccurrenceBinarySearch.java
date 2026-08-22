public class FirstOccurrenceBinarySearch{
  public static void main(String[] args) {
    int[] arr= {1, 3, 4, 5, 7, 8, 10, 10, 10, 12, 15, 18, 19, 19, 21};
    int target= 19;
    System.out.print(firstOccurrence(arr, target));
  }
  static int firstOccurrence(int[]arr, int target){
    int start=0, end= arr.length-1, index= -1;
    while (start<=end){
      int mid= start+(end-start)/2;
      if (target==arr[mid]){
        while(mid>=0){
          if (arr[mid]==target)
            index= mid;
            mid--;
        }
        return index;
      }
      if (target<arr[mid])
        end= mid-1;
      else
        start= mid+1;
    }
    return -1;
  }
}