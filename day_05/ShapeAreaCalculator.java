public class ShapeAreaCalculator{
  public static void main(String[] args) {
    area(2.5);
    area(4, 6);
    area(5);
  }
  static void area(int side){
    System.out.printf("Area of the square is: %d%n", side*side);
  }
  static void area(int length, int width){
    System.out.printf("Area of the rectangle is: %d%n", length*width);
  }
  static void area(double radius){
    System.out.printf("Area of the circle is: %.2f%n", Math.PI*radius*radius);
  }
}