import java.util.Scanner;

import model.BankAccount;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            boolean isRunning = true;

            while (isRunning) {

                System.out.print("ENTER USER NAME :");
                String name = sc.next();
                boolean isValide = utils.InputValidator.isString(name);
                if (!isValide) {
                    System.out.println(".... USER NAME SHOULD BE IN CHARACTER...");
                    continue;
                }

                System.out.print("ENTER INITIAL BALANCE :");
                double balance =  sc.nextDouble();

                boolean isValideBalance = utils.InputValidator.isPositive(balance);
                if (!isValideBalance) {
                    System.out.println("INTIAL BALANCE SHOULD NOT BE NEGATIGE OR ZERO.");
                    continue;
                }

                BankAccount account = new BankAccount(name, balance);

                System.out.println("...SUCESSFULLY ACCOUNT CREATED....");
                System.out.println("USER NAME :" + name + " INITIAL BALANCE:" + balance);

                while (true) {

                    System.out.println("""
                            ENTER D TO DEPOSITE MONEY.
                            ENTER W TO WITHDRAW MONEY.
                            ENTER CK TO CHECK BALANCE.

                            ENTER E TO EXIT ACCOUNT.
                            """);

                    System.out.print("YOUR CHOICE: ");
                    String choice = sc.next().toLowerCase().toUpperCase();

                    service.BankService.manageAc(sc, choice, account, balance);

                }

            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
