import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Hello");
        list1.add("World");
        list1.add("Java");

        LinkedList<String> list2 = new LinkedList<>();
        list2.add("Hello_");
        list2.add("World_");
        list2.add("Java_");

        System.out.println(list1);
        System.out.println(list2);

        listPrint(list1);
        listPrint(list2);

    }

    public static void listPrint(List<String> list) {
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("==============");
    }
}