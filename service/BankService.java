package service;

import java.util.Scanner;

import model.BankAccount;

public class BankService {

    public static void manageAc(Scanner sc, String choice, BankAccount account, double balance) {

        switch (choice) {

            case "D":
                account.deposite(balance);

                break;
            case "W":
                account.withDraw(balance);

                break;
            case "CK":
                account.checkBalance();

                break;
            case "E":
                System.out.println("<<<<EXITING ACCOUNT>>>>>>");
                 System.exit(0);

            default:
                System.out.println(".......INVALIDE OPTION SELECTED.......");
                break;
        }

    }

}
