import java.util.Scanner;

public class BankingApplication {
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);

        MyBankAccount bank = new MyBankAccount(" ", " ");

        System.out.println("Enter your name please: ");
        bank.customerName = userinput.nextLine();
        System.out.println();

        System.out.println("Enter your account ID: ");
        bank.customerID = userinput.nextLine();
        System.out.println();

        bank.showMenu();
        userinput.close();

    }
}

class MyBankAccount {
    double mybalance;
    double previoustransaction;
    String customerName;
    String customerID;

    MyBankAccount(String cName, String cID) {
        customerName = cName;
        customerID = cID;
    }

    void deposit(double amount) {
        if (amount != 0) {
            mybalance = mybalance + amount;
            previoustransaction = amount;
        }
    }

    void withdraw(double amount) {
        if (amount != 0) {
            mybalance = mybalance - amount;
            previoustransaction = -amount;
        }
    }

    void getPreviousTransaction() {
        if (previoustransaction > 0) {
            System.out.println("Deposited: " + "$" + previoustransaction);
        } else if (previoustransaction < 0) {
            System.out.println("Withdrawn: " + "$" + Math.abs(previoustransaction));
        } else {
            System.out.println("No transaction has been made!");
        }
    }

    void showMenu() {
        int option = 0;
        Scanner userinput = new Scanner(System.in);

        System.out.println("Welcome " + customerName + "!");
        System.out.println(customerName + ", your ID is " + customerID + ".");
        System.out.println();
        System.out.println("1. Check account balance.");
        System.out.println("2. Deposit.");
        System.out.println("3. Withdraw.");
        System.out.println("4. Get Previous Transaction.");
        System.out.println("5. Exit.");

        do {
            System.out.println("---------------------------------");
            System.out.println("Enter your option: ");
            System.out.println("---------------------------------");
            option = userinput.nextInt();

            switch (option) {
                case 1:
                    System.out.println("---------------------------------");
                    System.out.println("Your balance is: " + "$" + mybalance);
                    System.out.println("---------------------------------");
                    System.out.println();
                    break;

                case 2:
                    System.out.println("---------------------------------");
                    System.out.println("Enter the amount you want to deposit");
                    System.out.println("---------------------------------");
                    double amount1 = userinput.nextDouble();
                    deposit(amount1);
                    System.out.println();
                    break;

                case 3:
                    System.out.println("---------------------------------");
                    System.out.println("Enter the amount you want to withdraw");
                    System.out.println("---------------------------------");
                    double amount2 = userinput.nextDouble();
                    withdraw(amount2);
                    System.out.println();
                    break;

                case 4:
                    System.out.println("---------------------------------");
                    getPreviousTransaction();
                    System.out.println("---------------------------------");
                    System.out.println();
                    break;

                case 5:
                    System.out.println("---------------------------------");
                    break;

                default:
                    System.out.println("Invalid option!");
                    break;
            }
        } while (option != 5);

        userinput.close();
    }
}
