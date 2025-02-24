import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        //System.out.println("Hello and welcome!");
        System.out.println("Welcome to JavaEE! What is your name? ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        //System.out.println("Welcome to JavaEE! "+name);
        int age = scanner.nextInt();
        System.out.println("Hi "+name+" your age is : "+age);


    }
}