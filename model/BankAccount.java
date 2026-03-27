package model;

import java.util.Scanner;

public class BankAccount {
    Scanner sc = new Scanner(System.in);
    public String name;
    public double balance;
    public double totalBalance;

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void deposite(double balance) {
        System.out.print("ENTER AMOUNT TO DEPOSITE :");
        balance = sc.nextDouble();

        totalBalance += balance;

        System.out.println(balance + "RUPEES SUCESSFULLY DEPOSITED.");

    }

    public void withDraw(double balance) {

        System.out.print("ENTER AMOUNT TO  WITHDRAW :");
        balance = sc.nextDouble();
        if (balance <= totalBalance) {
            totalBalance -= balance;
        } else {
            System.out.println("INSUFFICIENT AMOUNT WANT TO WITHDRAW.");
        }

        System.out.println(balance + "RUPEES SUCESSFULLY  WITHDRAWED.");

    }

    public void checkBalance() {
        System.out.println("TOTAL BALANCE :" + totalBalance);
    }

}
