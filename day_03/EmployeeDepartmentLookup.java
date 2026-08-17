import java.util.*;
class EmployeeDepartmentLookup{
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int emp_id= sc.nextInt();
    switch (emp_id){
      case 1->System.out.print("Human Resources");
      case 2->System.out.print("Finanace");
      case 3->System.out.print("Engineering");
      case 4->System.out.print("Marketing");
      default->System.out.print("Invalid emplyee ID");
    }
    sc.close();
  }
}