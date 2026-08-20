public class ArraySumCalculator{
  static void sumArray(int[] arr){
    int sum=0;
    for (int ele: arr){
      sum+=ele;
    }
    System.out.printf("Sum: %d", sum);
  }
  public static void main(String[] args) {
    int[] numbers= {1, 2, 3, 4, 5};
    sumArray(numbers);
  }
}