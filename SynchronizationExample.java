// Shared resource (Bank Account)
class BankAccount {
    private int balance = 5000; // Initial balance

    // Synchronized method to ensure only one thread can withdraw at a time
    synchronized void withdraw(int amount) {  
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " is withdrawing " + amount);
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " completed withdrawal. Remaining balance: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " cannot withdraw. Insufficient balance.");
        }
    }
}

// Thread class that performs withdrawal
class Customer1 extends Thread {
    BankAccount account;
    int amount;

    Customer1(BankAccount account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    public void run() {
        account.withdraw(amount);
    }
}

// Main class
public class SynchronizationExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(); // Shared bank account object

        // Two customers (threads) trying to withdraw money
        Customer1 c1 = new Customer1(account, 3000);
        Customer1 c2 = new Customer1(account, 5000);

        c1.setName("Customer 1");
        c2.setName("Customer 2");

        c1.start(); // Starts first withdrawal
        c2.start(); // Starts second withdrawal
    }
}
