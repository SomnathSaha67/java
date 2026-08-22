public class GuessCountMinimizer{
  public static void main(String[] args) {
    int[] arr= {1, 3, 4, 5, 7, 8, 10, 10, 10, 12, 15, 18, 19, 19, 21};
    int target= 19, low= 6, high= arr.length-1;
    System.out.print(findNumber(arr, low, high, target));
  }
  static int findNumber(int[]arr,int low, int high, int number){
    int count=0;
    while(low<=high){
      int mid= low+(high-low)/2;
      if (arr[mid]==number)
        count++;
      if (number<arr[mid])
        high=mid-1;
      else
        low=mid+1;
    }
    if (count>0){
      return count;
    }
    return -1;
  }
}