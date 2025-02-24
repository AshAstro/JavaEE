//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        String s = "Hello";
        String t = "World";
        String c = s+t;
        System.out.println(c);
       // if(c == "HelloWorld"){
        if (c.equals("HelloWorld")) {
            System.out.println("HI/...");
        }else{
            System.out.println("Oiii...");
        }
    }
}