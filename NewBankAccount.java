package lab_6_3;

public class NewBankAccount {

    private final static double DEFAULT_INTEREST_RATE = 0.02;
    private int id;
    private double balance;
    private static double interestRate = DEFAULT_INTEREST_RATE;
    private static int bankAccountCount = 1;
    public static NewBankAccount[] arrey = new NewBankAccount[101];

    public NewBankAccount(int id) {
        this.id = bankAccountCount;
        this.balance = 0;
        this.interestRate = DEFAULT_INTEREST_RATE;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit of " + amount + " successful. New balance: " + balance);
    }

    public void setInterestRateR(double interestRate) {
        this.interestRate = interestRate;
        System.out.println("Interest rate set to " + interestRate + "%");
    }

    public double getInterest(int years) {
        double interest = balance * interestRate * years / 100;
        System.out.println("Interest earned after " + years + " years: " + interest);
        return interest;
    }

    static void createAccount() {
        if (arrey.length >= 102) {
            System.out.println("Cannot create more than 100 accounts");
            return;
        }
        int newId = bankAccountCount;
        NewBankAccount account = new NewBankAccount(newId);
        arrey[bankAccountCount] = account;
        bankAccountCount++;
        System.out.println("Account created with ID: " + newId);
    }

    static void deposit(int id, double amount) {

        NewBankAccount account = arrey[id];
        if (account == null) {
            System.out.println("Account not found");
            return;
        }

        account.deposit(amount);
    }

    static void setInterestRate(double newinterestRate) {
        interestRate = newinterestRate;
    }

    static void getInterest(int id, int years) {
        NewBankAccount account = arrey[id];
        if (account == null) {
            System.out.println("Account not found");
            return;
        }

        account.getInterest(years);
    }
}


