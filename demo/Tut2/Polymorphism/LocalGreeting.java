package demo.Tut2.Polymorphism;

public class LocalGreeting extends Greeting {
    @Override
    public void hello(String name) {

        System.out.println("Namaste " + name);
    }
}
