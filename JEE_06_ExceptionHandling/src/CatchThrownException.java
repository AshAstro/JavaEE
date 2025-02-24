public class CatchThrownException {
    public static void main(String[] args) {
        try {
            ThrowException throwException = new ThrowException();
            int out = throwException.add(1,0);

            //final int add = throwException.add(4, 0);

            System.out.println("Final out==> "+out);
            //System.out.println("Final add==> "+add);
        } catch (ArithmeticException e) {
            throw new RuntimeException(e.getMessage(),e.getCause());
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        } finally {
            System.out.println("Final finally");
        }
    }
}
