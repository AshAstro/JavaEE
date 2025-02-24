import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        Data<Integer,String> data = new Data<>();
        data.Data(1,"Ash");
        data.Data(2,"Bob");
        //data.Data("23", 2343.345);

        //Data<Integer,CustomData> customData = new Data<>(1,new Custom<String>("Astro"));
//custom method used in generics
        Data<Integer,CustomData> customDataData = new Data<Integer, CustomData>();
        customDataData.Data(1,new CustomData("Astro"));


    }

    public static class Data<K extends Number,V>{
        public void Data(K key, V value) {
            System.out.println("Key: " + key + " Value: " + value);
        }
    }

    public static class CustomData{


        private final String value;

        public CustomData(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return  value;
        }
//        public void Custom(E value) {
//            System.out.println("Custom: " + value);
//        }

    }

}
