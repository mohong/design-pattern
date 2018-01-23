package 计算器;

public class Main {
    public static void main(String[] args) {
        Factory addFactory = new AddFactory();
        Operation operation = addFactory.createOperation();
        operation.setNumberA(1);
        operation.setNumberB(2);

        System.out.println(operation.getResult());
    }
}
