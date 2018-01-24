import java.io.IOException;

public class PrototypeClient {
    public static void shallowCopy() throws CloneNotSupportedException {
        Resume a = new Resume();
        a.setName("大鸟");
        a.setGender("男");
        a.setAge(20);
        a.setWorkExperience("2001", "baidu");

        Resume b = (Resume) a.clone();
        b.setWorkExperience("2001", "tencent");

        Resume c = (Resume) a.clone();
        c.setWorkExperience("2001", "ali");

        a.display();
        b.display();
        c.display();
    }

    public static void deepCopy() throws IOException, ClassNotFoundException, CloneNotSupportedException {
        Resume a = new Resume();
        a.setName("大鸟");
        a.setGender("男");
        a.setAge(20);
        a.setWorkExperience("2001", "baidu");

        Resume b = (Resume) a.deepClone();
        b.setWorkExperience("2001", "tencent");

        Resume c = (Resume) a.deepClone();
        c.setWorkExperience("2001", "ali");

        a.display();
        b.display();
        c.display();
    }
}
