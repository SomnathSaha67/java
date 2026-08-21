public class RowSumCalculator{
  public static void main(String[]args){
    int[][] arr= {{1, 2, 3}, {4, 5, 6, 7}, {6, 7, 8, 9}};
    rowSum(arr, 1);
  }
  static void rowSum(int[][]arr, int rowIndex){
    int sum=0;
    if(rowIndex<arr.length){
      for(int row:arr[rowIndex]){
        sum+=row;
      }
    }
    System.out.printf("Sum: %d", sum);
  }
}