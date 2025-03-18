//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        Bracket bracket = new Bracket();
        new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i <= 10; i++) {
                    bracket.bracket();
                }
            }
        }).start();

        new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i <= 10; i++) {
                    bracket.bracket();
                }
            }
        }).start();


    }
}

class Bracket {

    synchronized public void bracket() {
        String bracket = "";
        for (int i = 0; i <=30; i++) {
            if(i <= 15){
                bracket = bracket +"{";
            }else{
                bracket = bracket +"}";
            }
        }
        System.out.println(bracket);
    }

}