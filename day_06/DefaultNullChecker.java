import java.util.*;
public class DefaultNullChecker{
  public static void main(String[] args) {
    String[] str= new String[3];
    for (int i=0; i<str.length; i++){
      System.out.printf("Element %d: %d%n", i+1, str[i]);
    }
    str[0]="string1"; str[1]= "string2"; str[2]= "string3";
    System.out.print(Arrays.toString(str));
  }
}