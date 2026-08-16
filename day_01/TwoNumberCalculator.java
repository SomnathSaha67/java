import java.util.*;
public class TwoNumberCalculator{
  public static void main(String[]args){
    Scanner input = new Scanner (System.in);
    System.out.print("Enter two numbers: ");
    int a= input.nextInt(), b= input.nextInt();
    System.out.printf("Sum: %d%nDifference: %d%nProduct: %d%nAverage: %.2f", a+b, a-b, a*b, (a+b)/2.0);
    input.close();
  }
}