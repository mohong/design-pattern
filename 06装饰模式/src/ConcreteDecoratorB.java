public class ConcreteDecoratorB extends Decorator{

    @Override
    public void operation() {
        super.operation();
        addBehavior();
        System.out.println("具体装饰对象B的操作");
    }

    public void addBehavior() {
        System.out.println("add behavior");
    }
}
