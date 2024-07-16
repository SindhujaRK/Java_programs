import java.text.DecimalFormat;
import java.util.Scanner;
public class grades{
     public static void main(String[] args){
     Scanner sc= new Scanner(System.in);
     int[] grades=new int[20];
     int count=0;
     System.out.println("Enter the grades");
     for(int i=0;i<grades.length;i++){
        count++;
        grades[i]=sc.nextInt();
        if(grades[i]==-1){
           count-=1;
           break;}}
      DecimalFormat df=new DecimalFormat("#.00");
      System.out.println("Average=" + df.format(Average(grades,count)));}
public static double Average(int[] grades,int count){
      int sum=0;
      for(int i=0;i<count;i++){
          sum=+grades[i];}
          double average=(double)sum/count;
          return average;
}}
                                                                                    	                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 