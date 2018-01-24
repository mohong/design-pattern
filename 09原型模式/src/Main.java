import java.io.IOException;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        System.out.println("浅拷贝");
        PrototypeClient.shallowCopy();

        System.out.println("##########################");

        System.out.println("深拷贝");
        PrototypeClient.deepCopy();
    }
}
