import java.io.Serializable;

public class WorkExperience implements Serializable{
    private static final long serialVersionUID = 1L;
    private String workDate;
    private String workCompany;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getWorkDate() {
        return workDate;
    }

    public void setWorkDate(String workDate) {
        this.workDate = workDate;
    }

    public String getWorkCompany() {
        return workCompany;
    }

    public void setWorkCompany(String workCompany) {
        this.workCompany = workCompany;
    }
}
