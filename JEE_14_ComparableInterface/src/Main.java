import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        List list = new ArrayList();
        list.add("Hello");
        list.add("World");
        list.add("Java");
        System.out.println(list);
        compareInterface compareInterface = new compareInterface();
        System.out.println(compareInterface.compareTo(list.get(0).toString()));
    }

    public static class compareInterface implements Comparable<String>{


        @Override
        public int compareTo(String o) {
            return o.compareTo(this.toString());
        }
    }
}