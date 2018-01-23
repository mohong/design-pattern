package 计算器;

public class AddFactory implements Factory{
    @Override
    public Operation createOperation() {
        return new OperationAdd();
    }
}
