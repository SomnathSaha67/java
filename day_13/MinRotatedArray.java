public class MinRotatedArray{
  public static void main(String[] args) {
    int[]arr= {9, 10, 1, 2, 3, 4, 5, 6, 7, 8};
    System.out.print(binarySearch(arr));
  }
  static int binarySearch(int[]nums){
    int start=0, end= nums.length-1;
    while(start<end){
      int mid= start+(end-start)/2;
      if (nums[mid]>nums[end])
        start= mid+1;
      else
        end= mid;
    }
    return nums[start];
  }
}