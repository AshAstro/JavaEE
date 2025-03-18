import static java.lang.Thread.sleep;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static int counter;

    public static void main(String[] args) throws InterruptedException {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        //int counter = 0;
        new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 100000; i++) {
                    Main.counter++;
                }
            }
        }).start();
       // sleep(1000);
        new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 100000; i++) {
                    Main.counter++;
                }
            }
        }).start();

        System.out.println("Counter: " + Main.counter);

    }
}