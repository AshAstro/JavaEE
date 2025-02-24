import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        Set<String> set = new HashSet<String>();
        set.add("Java");
        set.add("C");
        set.add("C++");
        set.add("C#");
        set.add("C++");
        System.out.println(set);

        System.out.println(set.contains("Java"));


        Set set2 = new HashSet();
        for(int i=30; i>=0; i--) {
            set2.add(i);
        }
        System.out.println(set2);

        Set set3 = new HashSet();
        for(int i=30; i>=0; i--) {
            set3.add("AVI"+i);
        }
        System.out.println(set3);

        Set set4 = new LinkedHashSet();
        for(int i=30; i>=0; i--) {
            set4.add("AVI"+i);
        }
        System.out.println(set4);

        Set set5 = new TreeSet();
        for(int i=30; i>=0; i--) {
            set5.add("AVI"+i);
        }
        System.out.println(set5);
    }
}