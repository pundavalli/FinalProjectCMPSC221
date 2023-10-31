import java.util.ArrayList;
import java.util.Date;

public class Student extends People {
    private String major;
    private double tuition;
    private Date admittedDate;
    private ArrayList<Course> courses;

    public Student() {
        major = "";
        tuition = 0.0;
        admittedDate = null;
        courses = null;
    }

    public Student(String name, String ID) {
        super(name, ID);
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

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    @Override
    public void Payment() {
        //calculate tuition from price of list of courses - price per credit
        tuition = 0.0;
        for (Course c : courses) {
            tuition += c.getNumOfCredits() * c.getPrice();
        }
    }

    @Override
    public String Display() {
        return String.format("%s\n" +
                        "%s\n" +
                        "%s\n" +
                        "%s\n" +
                        "Major: %s\n",
                getName(), getID(), getEmail(), getAddress(), major);
    }
}
