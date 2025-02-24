import java.util.ArrayList;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        ArrayList<IntWrapper> list = new ArrayList<>();
        list.add(new IntWrapper(24));
        list.add(new IntWrapper(25));
        list.add(new IntWrapper(26));
        list.add(new IntWrapper(27));
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getValue());
        }



    }

    public static class IntWrapper {

        public int value;

        public IntWrapper(int i) {
            this.value = i;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }
}