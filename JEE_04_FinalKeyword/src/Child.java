public class Child extends Parent {
    public int age = 26;

    public final int newAge;
    public Child() {
        this.newAge = 29;
    }
// when ever its final keyword used its initialized in default constructor
    public Child(int age, int newAge) {
        this.age = age;
        this.newAge = newAge;
    }

    //method overriding
    @Override
    public void dad(){
        System.out.println("Child dad");
    }
}
