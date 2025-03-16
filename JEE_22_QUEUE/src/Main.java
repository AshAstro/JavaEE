import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        Queue<String> queue = new LinkedList<String>();
        queue.add("Hello");
        queue.add("World");
        queue.add("!");

        System.out.println(queue);

        Queue<Integer> queueInt = new ArrayBlockingQueue<>(5);
        queueInt.add(1);
       // queueInt.add(2);
        queueInt.add(3);
        queueInt.add(4);
        queueInt.add(5);
        queueInt.offer(6);
       // queueInt.add(6);

        System.out.println(queueInt);
        System.out.println(queue.peek());
    }

}