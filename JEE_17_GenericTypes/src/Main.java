import javax.lang.model.element.Element;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");


        /*
        * Type - T
        * Element - E
        * Key - K
        * Value - V
        * Number - N*/

        Data<Integer,String> data = new Data<>(4,"Ash");
        System.out.println("Key : "+data.key+" Value : "+data.value);

        data.display(24.45,'A'); //using generics



    }

    static class Data<K,V>{
        K key;
        V value;
        public Data(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Data{" +
                    "key=" + key +
                    ", value=" + value +
                    '}';
        }

        public<E,N> void display(E element, N number){
            System.out.println("element : "+element+" number : "+number);
        }
    }
}