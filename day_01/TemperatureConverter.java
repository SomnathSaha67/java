import java.util.*;
public class TemperatureConverter{
  public static void main(String[]args){
    Scanner input= new Scanner(System.in);
    System.out.print("Enter temperature in Fahrenheit: ");
    double tempF= input.nextDouble();
    System.out.printf("Temperature in Fahrenheit: %.2f%nTemperature in Celsius: %.2f", tempF, (tempF-32)*(5.0/9));
    input.close();
  }
}