//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        doSomething();

    }

    public static class CustomException extends Exception {
        public CustomException(String message) {
            super(message);
        }
    }

    public static void doSomething() throws Exception,ArithmeticException{
        try {
            int x= 10;
            System.out.println("I am in DoSomething class : " +   x);
            throw new ArithmeticException();

            //System.out.println("I am in DoSomething class : " +   x);
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            throw new CustomException("Hi its new costume msg");
        }

    }
}