package 计算器;

public class SubFactory implements Factory{
    @Override
    public Operation createOperation() {
        return new OperationSub();
    }
}
