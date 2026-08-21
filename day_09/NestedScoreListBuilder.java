import java.util.*;
public class NestedScoreListBuilder{
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    ArrayList<ArrayList<Integer>> scores= new ArrayList<>();
    for (int i=0; i<3; i++){
      scores.add(new ArrayList<>());
    }    
    for (int i=0; i<3; i++){
      for (int j=0; j<3; j++){
        scores.get(i).add(sc.nextInt());
      }
    }
    for (ArrayList<Integer> arr: scores){
      for (int ele:arr){
        System.out.printf("%d ", ele);
      }
      System.out.println();
    }
  }
}