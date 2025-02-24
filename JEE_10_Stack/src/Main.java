import java.util.Stack;
import java.util.Vector;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        Stack<String> stack = new Stack<String>();
        stack.push("Hello");
        stack.push("World");
        stack.push("Java");
        stack.push("Stack");
        stack.push("Elements");
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.push("elements"));
        System.out.println(stack);
        System.out.println(stack.search("java"));
        System.out.println(stack.search("World"));
        System.out.println(stack);
//Base class methods
        System.out.println(stack.get(2));
        System.out.println(stack.indexOf("Stack"));


        Vector<Integer> vector = new Vector<>();
        vector.add(24);
        vector.add(32);
        vector.add(42);
        System.out.println(vector);
        System.out.println(vector.get(0));
        System.out.println(vector.get(1));
        System.out.println(vector.capacity());
        System.out.println(vector.size());
        System.out.println(vector.elementAt(0));
        //System.out.println(vector.copyInto());
    }
}