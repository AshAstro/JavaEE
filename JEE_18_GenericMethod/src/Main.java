import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        Data data = new Data();
        data.dataPrint(list);

        String[] list1 = {"One", "Two", "Three", "Four", "Five"};
        data.dataPrint(list1);

        Integer[] list2 = {1, 2, 3, 4, 5};
        data.dataPrint(list2);

        BigDecimal[] bigDecimals = {new BigDecimal("1.5"), new BigDecimal("2.5"), new BigDecimal("3.5")};
        data.dataPrint(bigDecimals);

        Double[] doubles = {1.0, 2.0, 3.0, 4.0, 5.0};
        data.dataPrint(doubles);

        Float[] floats = {1.0f, 2.0f, 3.0f, 4.0f, 5.0f};
        data.dataPrint(floats);





    }

    public static class Data{
        public<E> void dataPrint(List<E> list){
            for (E element: list){
                System.out.println(element);
            }
        }
        public<E> void dataPrint(E[] list){
            for (E element: list){
                System.out.println(element);
            }
        }
    }
}