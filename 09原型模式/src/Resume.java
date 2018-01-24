import java.io.*;

public class Resume implements Cloneable, Serializable{

    private static final long serialVersionUID = -4410449301166191440L;

    private String name;
    private String gender;
    private int age;

    private WorkExperience workExperience;

    public Resume() {
        workExperience = new WorkExperience();
    }

    public void display() {
        System.out.println(this.getName() + " " + this.getGender() + " "
                + this.getAge() + "\n工作经历： "
                + this.getWorkExperience().getWorkDate() + " "
                + this.getWorkExperience().getWorkCompany());
    }

    /**
     * 浅拷贝
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    /**
     * 深拷贝
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public Object deepClone() throws IOException, ClassNotFoundException {
        // 将对象写入流内
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        // 从流内读出对象
        ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(
                bos.toByteArray()));
        return ois.readObject();
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public WorkExperience getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(String workDate, String workCompany) {
        this.workExperience.setWorkDate(workDate);
        this.workExperience.setWorkCompany(workCompany);
    }
}
