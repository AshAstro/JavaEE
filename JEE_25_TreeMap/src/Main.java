import java.util.Comparator;
import java.util.TreeMap;


class code implements Comparable<code> {

    public code(int temp) {
        this.temp = temp;
    }

    int temp;

    public int getTemp() {
        return temp;
    }


    @Override
    public int compareTo(code o) {
        return this.temp - o.temp;
    }
}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        map.put(6, "six");
        map.put(7, "seven");

        TreeMap<code,String > mapCode = new TreeMap<>();
        mapCode.put(new code(1), "one");
        mapCode.put(new code(2), "two");
        mapCode.put(new code(3), "three");

        System.out.println(map);
        //System.out.println(mapCode);


        for (Integer key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }

        for (code key : mapCode.keySet()) {
            System.out.println(key + ": " +  mapCode.get(key));
        }

    }
}