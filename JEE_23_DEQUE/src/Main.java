import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.LinkedBlockingDeque;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        Deque d = new LinkedBlockingDeque();
        d.add("Hello");
        d.add("World");
        d.add("Java");
        System.out.println(d.poll());
        System.out.println(d.peekFirst());;

    }
}