//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        Subject subject = Subject.Science;
        switch (subject){
            case Tamil -> System.out.println("Tamil");
            case English -> System.out.println("English");
            case Maths -> System.out.println("Maths");
            case Science -> System.out.println("Science");
            case Social_Science -> System.out.println("Social Science");
            default -> System.out.println("Unknown");
        }

    }
}