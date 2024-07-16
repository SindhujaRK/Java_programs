import java.util.Scanner;
public class integer{
       public static void main(String[] args){
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter first number");
       int num1= sc.nextInt();
       System.out.println("Enter second number");
       int num2= sc.nextInt();
       int Sum=num1+num2;
       int Product=num1*num2;
       int Difference=num1-num2;
       int Division=num1/num2;
       System.out.println("Sum="+Sum);
       System.out.println("Product="+Product);
       System.out.println("Diffrence="+Difference);
       System.out.println("Division="+Division);
}}