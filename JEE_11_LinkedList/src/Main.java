import java.util.LinkedList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        LinkedList<String> list = new LinkedList();
        list.add("Hello");
        list.add("World");
        list.add("Java");
        System.out.println(list);
        list.add("C");
        list.add("C++");
        System.out.println(list);
        list.removeFirst();
        System.out.println(list);
        System.out.println(list.listIterator(4));
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.peek());
        System.out.println(list.set(3,"Python"));
        System.out.println(list);
        System.out.println(list.offer("Python"));
        System.out.println(list);
        System.out.println(list.offer("Python"));
        System.out.println(list);
        System.out.println(list.indexOf("Python"));


    }
}