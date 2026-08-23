public class MountainArray{
  public static void main(String[] args) {
    int[]arr= {1, 2, 3, 5, 6, 7, 8, 9, 8, 7, 6, 5, 4, 3, 2};
    System.out.print(findPeak(arr));
  }
  static int findPeak(int[]arr){
    int start=0, end= arr.length-1;
    while(start<=end){
      int mid= start+(end-start)/2;
      if (start==end)
        return mid;
      if (arr[mid]>arr[mid-1]&&arr[mid]>arr[mid+1])
        return arr[mid];
      if(arr[mid]<arr[mid+1])
        start= mid+1;
      else if(arr[mid]>arr[mid+1])
        end= mid;
    }
    return -1;
  }
}