import java.util.Scanner;
public class degree{
      public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the temperature in fahrenheit");
      double fahrenheit=sc.nextDouble();
      double celcius=(fahrenheit-32)*5/9;
      System.out.print("Celcius="+celcius);
}}
      