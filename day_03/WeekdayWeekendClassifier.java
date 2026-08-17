import java.util.*;
public class WeekdayWeekendClassifier{
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int day= sc.nextInt();
    switch(day){
      case 1,2,3,4,5 -> System.out.print("Weekday");
      case 6,7 -> System.out.print("Weekend");
    }
    sc.close();
  }
}