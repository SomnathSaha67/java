public class ShadowedCounterDemo{
  static int count= 0;
  static void local(){
    int count= 5;
    System.out.print(count);
  }
  public static void main(String[] args) {
    System.out.println(count);
    local();
  }
}