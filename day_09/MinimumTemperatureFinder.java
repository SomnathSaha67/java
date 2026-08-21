import java.util.*;
public class MinimumTemperatureFinder{
  public static void main(String[]args){
    double[] temps= {36.5, 37.0, 38.2, 39.1, 35.8, 36.9, 37.4};
    System.out.printf("Minimum temprature: %.2f", findMin(temps));
  }
  static double findMin(double[] temps){
    double min= temps[0];
    for (double ele:temps){
      if (min>ele){
        min= ele;
      }
    }
    return min;
  }
}