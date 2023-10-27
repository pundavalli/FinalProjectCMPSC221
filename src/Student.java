import java.util.Date;

public class Student extends People {
    private String major;
    private double tuition;
    private Date admittedDate;
    private Course[] courses;

    public Student() {
        major = "";
        tuition = 0.0;
        admittedDate = null;
        courses = null;
    }

    public Student(People person, String major, double tuition, Date admittedDate, Course[] courses) {
        super(person);
        this.major = major;
        this.tuition = tuition;
        this.admittedDate = admittedDate;
        this.courses = courses;
    }

    public Student(String name, String ID, String email, String address, int phoneNum, String major, double tuition, Date admittedDate, Course[] courses) {
        super(name, ID, email, address, phoneNum);
        this.major = major;
        this.tuition = tuition;
        this.admittedDate = admittedDate;
        this.courses = courses;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getTuition() {
        return tuition;
    }

    public void setTuition(double tuition) {
        this.tuition = tuition;
    }

    public Date getAdmittedDate() {
        return admittedDate;
    }

    public void setAdmittedDate(Date admittedDate) {
        this.admittedDate = admittedDate;
    }

    public Course[] getCourses() {
        return courses;
    }

    public void setCourses(Course[] courses) {
        this.courses = courses;
    }

    @Override
    public void Payment() {

    }

    @Override
    public void Display() {

    }
}
