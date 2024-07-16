import java.util.Scanner;
public class sphere{
       public static void main(String[] args){
       Scanner sc= new Scanner(System.in);
       System.out.print("Enter the radius ");
       double radius=sc.nextDouble();
       double volume=spherevolume(radius);
       System.out.println("The volume of the sphere is " +volume);
}
public static double spherevolume(double radius){
          double volume=(4/3)*3.14*(radius*radius*radius);
          return volume;
}}