public class Ceiling{
  public static void main(String[]args){
    int[] arr= {2,3,5,9,14,16,17,18};
    int target= -1;
    System.out.print(ceilingFinder(arr, target));
  }
  static int ceilingFinder(int[]arr, int target){
    if (target>arr[arr.length-1])
        return -1;
    int start=0, end= arr.length-1;
    while(start<=end){
      int mid= start+(end-start)/2;
      if(arr[mid]==target)
        return arr[mid];
      if (target>arr[mid])
        start= mid+1;
      else
        end= mid-1;
    }
    return arr[start];
  }
}