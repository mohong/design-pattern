public class Context {

    private Strategy strategy;

    public Context(String type) {
        switch (type) {
            case "A":
                this.strategy = new ConcreteStrategyA();
                break;
            case "B":
                this.strategy = new ConcreteStrategyB();
                break;
            case "C":
                this.strategy = new ConcreteStrategyC();
                break;
            case "D":
                this.strategy = new ConcreteStrategyD();
                break;
        }
    }

    // 上下文接口
    public void ContextInterface() {
        strategy.AlgorithmInterface();
    }
}
