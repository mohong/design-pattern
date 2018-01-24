public class Main {
    public static void main(String[] args) {
        AbstractClass c = new ConcreteClassA();
        c.templateMethod();

        c = new ConcreteClassB();
        c.templateMethod();
    }
}
