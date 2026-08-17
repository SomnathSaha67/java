import java.util.*;
public class TieredBonusCalculator{
  public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter salary: ");
    int sal= sc.nextInt();
    if (sal>20000)
      sal+=3000;
    else if (sal<20000 && sal>10000)
      sal+=2000;
    else
      sal+=1000;
    System.out.printf("Salary (after bonus): %d", sal);
    sc.close();
  }
}