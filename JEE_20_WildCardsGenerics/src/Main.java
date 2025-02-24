import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        List<Vehicle > list = new ArrayList<>();
        list.add(new Vehicle("Hello"));
        list.add(new Vehicle("World"));
        list.add(new Vehicle("Java"));
        list.add(new Car("Python","Code"));

        Display(list);


    }
    public static void Display(List<? extends Object> list) {   // "?"- indicates wildcard
        for (Object o : list) {
            System.out.println(o);
        }
    }
}

class Vehicle {
    public String color;
    public Vehicle(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return  color;
    }
}
class Car extends Vehicle {
    private String model;
    public Car(String color, String model) {
        super(color);
        this.model = model;

    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}