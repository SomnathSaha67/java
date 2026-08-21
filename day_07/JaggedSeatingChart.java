import java.util.*;
public class JaggedSeatingChart{
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int[][] jagged= new int[4][];
    jagged[0]= new int[3]; jagged[1]= new int[2]; jagged[2]= new int[4]; jagged[3]= new int[5];
    for (int row=0; row<jagged.length; row++){
      for (int col=0; col<jagged[row].length; col++){
        System.out.printf("Enter element in [%d, %d]: ", row, col);
        jagged[row][col]= sc.nextInt();
      }
    }
    System.out.println("Row:");
    for (int[] row:jagged){
      for (int col:row){
        System.out.printf("%d ", col);
      }
      System.out.println();
    }
    System.out.println("Columns: ");
    int maxCols=0;
    for (int[] row:jagged){
      if(row.length>maxCols){
        maxCols= row.length;
      }
    }
    for (int col=0; col<maxCols; col++ ){
      for (int row=0; row<jagged.length; row++){
        if(col<jagged[row].length){
          System.out.printf("%d ", jagged[row][col]);
        }
      }
      System.out.println();
    }
  }
}