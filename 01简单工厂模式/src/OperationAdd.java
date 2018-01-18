/**
 * 加法类的实现
 */
public class OperationAdd extends Operation {
    @Override
    public int getResult() {
        return this.getNumberA() + this.getNumberB();
    }
}
