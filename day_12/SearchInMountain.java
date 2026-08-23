public class SearchInMountain{
  public static void main(String[] args) {
    int[]arr= {1, 2, 3, 4, 5, 6, 7, 6, 5, 4, 3, 2, 1};
    int target= 7;
    System.out.print(search(arr, target));
  }
  static int search(int[]arr, int target){
    int peak= findPeak(arr);
    int firstTry= binarySearch(arr, target, 0, peak, true);
    if (firstTry!=-1)
      return firstTry;
    return binarySearch(arr, target, peak+1, arr.length-1, false);
  }
  static int findPeak(int[]arr){
    int start=0, end= arr.length-1;
    while(start<end){
      int mid= start+(end-start)/2;
      if(arr[mid]<arr[mid+1])
        start= mid+1;
      else
        end= mid;
    }
    return start;
  }
   static int binarySearch(int[]arr, int target, int start, int end, boolean isAsc){
    while(start<=end){
      int mid= start+(end-start)/2;
      if (arr[mid]==target)
        return mid;
      if (isAsc){
        if (target<arr[mid])
          end= mid-1;
        else
          start= mid+1;
      }
      else{
        if (target<arr[mid])
          start= mid+1;
        else
          end= mid-1;
      }
    }
    return -1;
  }
}