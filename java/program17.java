public class SavingsAccount{
     private static double annualInterestRate;
     private double savingsBalance;
     public SavingsAccount(double balance){
          this.savingsBalance=balance;}
    public void calculateMonthlyInterest(){ 
          double monthlyinterest=(savingsBalance*annualInterestRate)/12;
          savingsBalance=savingsBalance+monthlyinterest;}
    public static void modifyInterestRate(double newvalue){
          annualInterestRate=newvalue;}
    public double getBalance(){
          return savingsBalance;}
public static void main(String[] args){
          SavingsAccount saver1=new SavingsAccount(2000);
          SavingsAccount saver2=new SavingsAccount(3000);
          SavingsAccount.modifyInterestRate(0.04);
          saver1.calculateMonthlyInterest();
          saver2.calculateMonthlyInterest();
          System.out.print("Saver1 balance after 4% increase is " +saver1.getBalance());
          System.out.print("\nSaver2 balance after 4% increase is " +saver2.getBalance());
          SavingsAccount.modifyInterestRate(0.05);
          saver1.calculateMonthlyInterest();
          saver2.calculateMonthlyInterest();
          System.out.print("\nSaver1 balance after 5% increase is " +saver1.getBalance());
          System.out.print("\nSaver2 balance after 5% increase is " +saver2.getBalance());
}}
    