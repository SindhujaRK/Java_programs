public class Employee{
       private String firstname;
       private String lastname;
       private double monthly_salary;
       public Employee( String firstname,String lastname,double monthly_salary){
          this.firstname=firstname;
          this.lastname=lastname;
          this.monthly_salary=monthly_salary;}
       public String getfirstname(){
          return firstname;}
       public void setfirstname(String firstname){
          this.firstname=firstname;}
       public String getlastname(){
          return lastname;}
       public void setlastname(String lastname){
          this.lastname=lastname;}
       public double getmonthly_salary(){
          return monthly_salary;}
       public void setmonthly_salary(double monthly_salary){
          if(monthly_salary>0){
             this.monthly_salary=monthly_salary;}
          else{
             monthly_salary=0;}}
       public double yearly_salary(){
             return monthly_salary*12;}
       public void raisesalary(double percentage){
             monthly_salary=monthly_salary*(1+percentage/100);}
public static void main(String[] args){
            Employee employee1=new Employee("Latha","Sekar",20000);
            Employee employee2=new Employee("Sandhiya","Kumar",30000);
            System.out.println("Employee1 " + employee1.getfirstname() + " " +employee1.getlastname());
            System.out.println("Yearly_salary " + employee1.yearly_salary());
            System.out.println("Employee2 " + employee2.getfirstname() + " " +employee2.getlastname());
            System.out.println("Yearly_salary " + employee2.yearly_salary());
            employee1.raisesalary(10);
            employee2.raisesalary(10);
            System.out.println("After 10% raise");
            System.out.println("Employee1 " + employee1.getfirstname() + " " +employee1.getlastname());
            System.out.println("Yearly_salary " + employee1.yearly_salary());
            System.out.println("Employee2 " + employee2.getfirstname() + " " +employee2.getlastname());
            System.out.println("Yearly_salary " + employee2.yearly_salary());
}}