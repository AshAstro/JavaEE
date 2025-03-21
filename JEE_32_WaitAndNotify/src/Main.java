//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        new Thread(new Runnable() {
            public void run() {
                main.withdrawal(5000);
            }
        }).start();

        new Thread(new Runnable() {
            public void run() {
                main.deposit(1000);
            }
        }).start();

    }

   synchronized public  void withdrawal(int amount) {
       int balance = 0;
        System.out.println("Welcome to the bank");
        try {
            wait(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        balance = balance - amount;
        System.out.println("Your balance is: " + balance);
    }

    public  void deposit(int amount) {
        synchronized (this) {
            int balance = 0;
            balance = balance + amount;
            System.out.println("Deposit your balance" + balance);
            notify();
        }
    }
}

