import java.util.*;
public class DynamicScoreCollector{
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    ArrayList<Integer> quizScores= new ArrayList<>();
    while (true){
      System.out.print("Enter quiz score(-1 to stop): ");
      int score= sc.nextInt();
      if (score==-1){
        break;
      }
      quizScores.add(score);
    }
    for (int ele:quizScores){
      System.out.printf("%d ", ele);
    }
  }
}