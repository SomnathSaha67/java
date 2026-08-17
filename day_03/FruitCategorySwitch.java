import java.util.*;
class FruitCategorySwitch{
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    String fruit= sc.next();
    switch (fruit){
      case "mango"->System.out.print("King of fruits");
      case "orange"->System.out.print("Citrus fruit");
      case "apple"->System.out.print("Keeps doctor away");
      default->System.out.print("Unrecognized fruit");
    }
    sc.close();
  }
}