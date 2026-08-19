import java.util.*;
public class AverageCalculator{
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int a= sc.nextInt(), b= sc.nextInt();
    System.out.printf("(%d + %d)/2= %.2f", a, b, average(a, b));
  }
  static double average(int a, int b){
    return (double)(a+b)/2.0;
  }
}