import java.util.*;
public class SumOfNaturalNumbers{
  public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter last number: ");
    long n= sc.nextLong();
    long c=1L, sum=0L;
    while (c<=n){
      sum+=c;
      c++;
    }
    System.out.printf("Sum of first %d natural numbers: %d", n, sum);
  }
}