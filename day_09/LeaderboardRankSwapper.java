import java.util.*;
public class LeaderboardRankSwapper{
  public static void main(String[] args) {
    int[] scores= {1, 2, 3, 4, 5 ,6, 7, 8, 9, 10};
    System.out.println("Scores before swapping: ");
    for (int i=0; i<scores.length; i++){
      System.out.printf("%d ", scores[i]);
    }
    System.out.println();
    swapRanks(scores, 4, 7);
  }
  static void swapRanks(int[] arr, int i, int j){
      int temp= arr[i];
      arr[i]= arr[j];
      arr[j]= temp;
      System.out.println("Scores after swapping: ");
    for (int k=0; k<arr.length; k++){
      System.out.printf("%d ", arr[k]);
    }
    }
}