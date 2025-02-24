//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        int y = 0;
        try{
            System.out.println("Before Exception");
            int x =(y=10)/0; //if the value is assigned in separate scope it will be considered
            System.out.println("After Exception"+x/0);

        } catch (Exception e) {
            //throw new RuntimeException(e);
            e.printStackTrace();
        }finally{
            System.out.println("Finally y ="+y);
        }
    }
}