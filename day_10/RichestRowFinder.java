public class RichestRowFinder{
  public static void main(String[] args) {
    int[][] accounts= {{1, 2, 3}, {6, 7, 8}, {3, 4, 5}, {5, 6, 7}};
    System.out.print(richestWealth(accounts));
  }
  static int richestWealth(int[][] accounts){
    int max= Integer.MIN_VALUE;
    for (int[] i:accounts){
      int sum=0;
      for (int j:i){
        sum+=j;
      }
      if (sum>max)
        max= sum;
    }
    return max;
  }
}