//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        Child  child = new Child();
        System.out.println(child.age);
        System.out.println(child.newAge);
        //child.newAge++;
        //since final varibale is not initializable
        System.out.println(child.newAge);

        //similar way a final method cannot be overridden
        Parent parent = new Parent();
        parent.dad();
        child.dad();



        //final class cannot be inherited
    }
}