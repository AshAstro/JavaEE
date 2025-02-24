import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        Data data = new Data("Helooo world");
        String str = (String) data.getData();
        System.out.println(str);

        GenericData<String> genericData = new GenericData<>(" ...World");
        String str2 =genericData.getData();
        System.out.println(str2);

    }

    static class Data{
        private Object data;
        public Data(Object data){
            this.data = data;
        }
        public Object getData(){
            return data;
        }
    }
    static class GenericData<T>{
        private T data;

        public GenericData(T data){
            this.data = data;
        }
        public T getData(){
            return data;
        }
    }
}