package lab_6_3;

import java.util.Scanner;

import static lab_6_3.NewBankAccount.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.print("Enter a command: ");
            String command = scanner.nextLine();

            String[] parts = command.split(" ");
            String action = parts[0].toLowerCase();

            switch (action) {
                case "create":
                    createAccount();
                    break;
                case "deposit":
                    int id = Integer.parseInt(parts[1]);
                    double amount = Double.parseDouble(parts[2]);
                    if (amount < 0) {
                        System.out.println("Invalid amount. Please enter a positive value.");
                        break;
                    }
                    deposit(id, amount);
                    break;
                case "setinterest":
                    double interestRate = Double.parseDouble(parts[1]);
                    if (interestRate < 0) {
                        System.out.println("Invalid interest rate. Please enter a positive value.");
                        break;
                    }
                    setInterestRate(interestRate);
                    break;
                case "getinterest":
                    int accountId = Integer.parseInt(parts[1]);
                    int years = Integer.parseInt(parts[2]);
                    if (years < 0) {
                        System.out.println("Invalid number of years. Please enter a positive value.");
                        break;
                    }
                    getInterest(accountId, years);
                    break;
                case "end":
                    running = false;
                    break;
                default:
                    System.out.println("Invalid command");
                    break;
            }
        }
    }
}