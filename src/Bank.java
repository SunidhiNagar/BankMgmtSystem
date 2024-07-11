package wiproTraining;

import java.util.Scanner;

interface Int {
    int deposit(int amount);
    int withdraw(int amount);
    int getBalance();
}

class Mgmt implements Int {
    private int balance;

    public Mgmt(int initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public int deposit(int amount) {
        System.out.println("Enter amount you want to deposit:");
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        balance += money;
        System.out.println("Deposited Successfully");
        System.out.println("Total balance: " + balance);
        return balance;
    }

    @Override
    public int withdraw(int amount) {
        System.out.println("Enter the amount you want to withdraw:");
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        if (balance >= money) {
            balance -= money;
            System.out.println("Withdraw Successful");
            System.out.println("Total balance: " + balance);
        } else {
            System.out.println("Not enough balance");
        }
        return balance;
    }

    @Override
    public int getBalance() {
        System.out.println("Total balance: " + balance);
        return balance;
    }
}

public class Bank {
    public static void main(String[] args) {
        System.out.println("Welcome!");
        System.out.println();
        System.out.println("Instructions:\nEnter 1 to Deposit\nEnter 2 to Withdraw\nEnter 3 to check the balance ");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        Mgmt m = new Mgmt(100000);

        while (true) {
            System.out.println("What do you want to do?");
            int i = sc.nextInt();

            switch (i) {
                case 1:
                    m.deposit(0);
                    break;
                case 2:
                    m.withdraw(0);
                    break;
                case 3:
                    m.getBalance();
                    break;
                default:
                    System.out.println("Invalid option. Please enter 1, 2, or 3.");
                    break;
            }
        }
    }
}
