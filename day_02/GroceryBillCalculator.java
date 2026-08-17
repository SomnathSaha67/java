import java.util.*;
class GroceryBillCalculator{
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    while (true){
      System.out.print("Enter operator (+, -, *, /, %) (or 'X'/'x' to stop): ");
      char op= sc.next().trim().charAt(0);
      if ("+-*/%".indexOf(op)!=-1){
        System.out.printf("Enter two numbers: ");
        int num1= sc.nextInt(), num2= sc.nextInt();
        if (op=='+')
          System.out.printf("%d %c %d= %d%n", num1, op, num2, num1+num2);
        else if (op=='-')
          System.out.printf("%d %c %d= %d%n", num1, op, num2, num1-num2);
        else if (op=='*')
          System.out.printf("%d %c %d= %d%n", num1, op, num2, num1*num2);
        else if (op=='/')
          if (num2!=0)
            System.out.printf("%d %c %d= %d%n", num1, op, num2, num1/num2);
        else
          System.out.printf("%d %c %d= %d%n", num1, op, num2, num1%num2);
      }
      else if (op=='X' || op=='x')
        break;
      else
        System.out.printf("Invalid operator!%n");
    }
  }
}