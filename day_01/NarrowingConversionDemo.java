import java.util.*;
class NarrowingConversionDemo{
  public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    System.out.print("Enter a decimal number: ");
    double numD= input.nextDouble();
    System.out.printf("Decimal number: %.2f%nTruncated Integer: %d", numD, (int)numD);
    input.close();
  }
}