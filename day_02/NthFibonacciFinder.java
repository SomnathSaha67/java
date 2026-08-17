import java.util.*;
public class NthFibonacciFinder{
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter 'nth' fibonacci sequence: ");
    int n= sc.nextInt(), first=0, second=1, c=2;
     System.out.printf("%d ", first);
    while (c<=n){
       System.out.printf("%d ", second);
      int temp= second;
      second= first+second;
      first= temp;
      c++;
    }
  }
}