class BankAccount {
    private final String owner;
    private final int pin;
    private double balance;

    public BankAccount(String owner, int pin, double balance) {
        this.owner = owner;
        this.pin = pin;
        this.balance = balance;
    }

    public String getOwner() {
        return owner;
    }

    public boolean checkPin(int enteredPin) {
        return enteredPin == pin;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Amount must be greater than zero.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Please collect $" + amount + ".");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("$" + amount + " deposited successfully.");
        }
    }
}

class ATM {
    private final BankAccount bankAccount;

    public ATM(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public boolean login(int pin) {
        if (bankAccount.checkPin(pin)) {
            System.out.println("Welcome, " + bankAccount.getOwner() + "!");
            return true;
        }
        System.out.println("Incorrect PIN.");
        return false;
    }

    public void showBalance() {
        System.out.println("Current balance: $" + bankAccount.getBalance());
    }
}

public class AtmMachineExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Alex", 1234, 500);
        ATM atm = new ATM(account);

        if (atm.login(1234)) {
            atm.showBalance();
            account.withdraw(100);
            account.deposit(50);
            atm.showBalance();
        }
    }
}