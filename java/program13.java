import java.util.Scanner;
public class Main {
    private double balance;
    public Main(double initialBalance) {
        if (initialBalance > 0) {
            balance = initialBalance;
        } else {
            System.out.println("Initial balance must be positive.");
            balance = 0;
        }}
        if (amount > 0) {
            balance = balance+amount;
        } else {
            System.out.println("Credit amount must be positive.");
        }}
    public void debit(double debitAmount) {
        if (debitAmount > balance) {
            System.out.println("Debit amount exceeded balance.");
        } else if (debitAmount > 0) {
            balance =balance-debitAmount;
        } else {
            System.out.println("Debit amount must be positive.");
        }}
    public double getBalance() {
        return balance;}
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter initial balance:");
        double initialBalance = sc.nextDouble();
        Main myMain = new Main(initialBalance);
        System.out.println("Initial balance: " + myMain.getBalance());
        System.out.println("Enter debit amount:");
        double debitAmount = sc.nextDouble();
        myMain.debit(debitAmount);
        System.out.println("Final balance: " + myMain.getBalance());
}}
