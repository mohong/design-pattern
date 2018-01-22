public class ConcreteDecoratorA extends Decorator{

    private String addState;

    @Override
    public void operation() {
        super.operation();
        addState = "new state";
        System.out.println("具体装饰对象a的操作");
    }
}
