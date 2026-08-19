import java.util.*;
public class PalindromeNumberChecker{
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
    System.out.print(isPalindrome(n));
  }
  static boolean isPalindrome(int n){
    int original= n, temp= 0;
    while (n>0){
      int lastDigit= n%10;
      temp= 10*temp+lastDigit;
      n=n/10;
    }
    return original==temp;
  }
}