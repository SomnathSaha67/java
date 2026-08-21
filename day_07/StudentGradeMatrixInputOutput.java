import java.util.*;
public class StudentGradeMatrixInputOutput{
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int numStudents= sc.nextInt(); int numSubjects= sc.nextInt();
    int[][] details= new int[numStudents][numSubjects];
    for (int row=0; row<details.length; row++){
      System.out.printf("Student %d marks: ", row+1);
      for (int col=0; col<details[row].length; col++){
        details[row][col]= sc.nextInt();
      }
    }
    System.out.printf("Report card: %n");
    for (int row=0; row<details.length; row++){
      System.out.printf("Student %d: %n", row+1);
      for (int col=0; col<details[row].length; col++){
        System.out.printf("Subject %d: %d%n", col+1, details[row][col]);
      }
    }
  }
}