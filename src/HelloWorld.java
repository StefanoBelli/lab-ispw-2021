class Superclass {

    private final void interestingMethod() {
        System.out.println("Superclass's interesting method.");
    }

    void exampleMethod() {
        interestingMethod();
    }
}

public class HelloWorld extends Superclass {

    void interestingMethod() {
        System.out.println("Subclass's interesting method.");
    }

    public static void main(String args[]) {
        HelloWorld me = new HelloWorld();
        me.exampleMethod();
    }
}