public class TwoOneDArraySortedSearch{
  public static void main(String[] args) {
    int[][] arr= {{1, 2, 3, 4},
                  {11, 25, 35, 45},
                  {57, 60, 74, 80},
                  {82, 94, 100, 150}};
    System.out.print(isFound(arr, 7));
  }
  static boolean isFound(int[][]matrix, int target){
    int m= matrix.length;
    int n= matrix[0].length;
    int left= 0;
    int right= m*n-1;
    while(left<=right){
      int mid= left+(right-left)/2;
      int midVal= matrix[mid/n][mid%n];
      if(midVal==target)
        return true;
      if(midVal>target)
        right--;
      else
        left++;
    }
    return false;
  }
}