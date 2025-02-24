import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        List<Object> list = new ArrayList<Object>();
        list.add(new Data("Avinash"));
        list.add(new Data(27));
        list.add(new Data(170.54));
        list.add(new Data('G'));
        Name   name = new Name("Guru");
        list.add(new Data(name));
        System.out.println(list);

    }
    static class Data{
        private Object object;

        public Data(Object object){
            this.object = object;
        }

        @Override
        public String toString() {
            return object.toString();
        }
    }
    static class Name{
        private String name;

        public Name(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return  name;
        }
    }
}