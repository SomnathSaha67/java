import java.util.*;
public class VowelOrConsonantChecker{
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    do{
      System.out.print("Enter a vowel or consonant: ");
      char c= sc.next().trim().charAt(0);
      if ("aeiouAEIOU".indexOf(c)!=-1)
        System.out.printf("Vowel%n");
      else if (c=='X' || c=='x')
        break;
      else
        System.out.printf("Consonant%n");
    }while (true);
  }
}