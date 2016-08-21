import java.util.Scanner;

public class BMICalculator {
  public static void main( String[] args) {
    Scanner keyboard = new Scanner(System.in);
    double m, kg, lbs, bmi;
    int ft, in;

    System.out.print( "Your height in feet: ");
    ft = keyboard.nextInt();

    System.out.print( "Your height in inches: ");
    in = keyboard.nextInt();

    System.out.print( "Your weight in lbs: ");
    lbs = keyboard.nextDouble();

    kg = 0.453592*lbs;
    m = (0.3048*ft + 0.0254*in);
    bmi = kg / (m*m);

    System.out.println( "Your BMI is " + bmi);
  }
}
