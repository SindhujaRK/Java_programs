import java.util.Scanner;
public class largesmall{
       public static void main(String[] args){
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter first number");
       int num1= sc.nextInt();
       System.out.println("Enter second number");
       int num2= sc.nextInt();
       System.out.println("Enter third number");
       int num3= sc.nextInt();  
       int Sum=num1+num2;
       int Product=num1*num2;
       int Average=(num1+num2)/2;
       int largest=Math.max(num1, Math.max(num2,num3));
       int smallest=Math.min(num1, Math.min(num2,num3));
       System.out.println("Sum="+Sum);
       System.out.println("Product="+Product);
       System.out.println("Average="+Average);
       System.out.println("Largest="+largest);
       System.out.println("Smallest="+smallest);
}}