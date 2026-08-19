import java.util.*;
public class WelcomeMessagePrinter{
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    String name= sc.next();
    printWelcome(name);
    printWelcome("Rahul");
  }
  static void printWelcome(String name){
    System.out.printf("Welcome %s!%n", name);
  }
}