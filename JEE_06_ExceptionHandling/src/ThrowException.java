public class ThrowException {

    public int add(int a, int b) throws ArithmeticException {
        int c = a / b;
        System.out.println("c : "+c);
        return c;
    }
}
