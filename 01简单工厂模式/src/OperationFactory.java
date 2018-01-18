/**
 * 工厂类
 */
public class OperationFactory {
    public static Operation createOperation (String operator) {
        switch (String.valueOf(operator)) {
            case "+":
                return new OperationAdd();
            case "-":
                return new OperationSub();
        }
        return null;
    }
}
