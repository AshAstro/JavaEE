import java.math.BigDecimal;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        ArrayList<Double> list = new ArrayList<>();
        list.add((76423648.42353467465334654624766865));//.add("Java");
//        list.add("C");
//        list.add("C++");
//        list.add("React");
//        list.add("Angular");
        System.out.println(list);
        System.out.println(list.get(1));
        list.remove("Java");
        System.out.println(list.get(1));
        System.out.println(list);

    }
}