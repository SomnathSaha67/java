import java.util.*;
public class MatrixDeclarationDemo{
  public static void main(String[]args){
    int[][] matrix= {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    System.out.printf("Rows: %n");
    for (int row=0; row<matrix.length; row++){
      System.out.printf("Row %d: %s%n", row+1, Arrays.toString(matrix[row]));
    }
    System.out.printf("Columns: %n");
    for (int col=0; col<matrix[0].length; col++){
      System.out.printf("Column %d: ", col+1);
      for (int row=0; row<matrix.length; row++){
        System.out.printf(" %d", matrix[row][col]);
      }
      System.out.println();
    }
  }
}