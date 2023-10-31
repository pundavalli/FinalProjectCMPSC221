import java.util.ArrayList;
import java.util.Date;

public class Advisor extends People {
    private String title;
    private double annualSalary;
    private Date hiredDate;
    private ArrayList<Student> advisees;

    public Advisor() {
        title = "";
        annualSalary = 0.0;
        hiredDate = null;
        advisees = null;
    }

    public Advisor(String name, String ID) {
        super(name, ID);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public Date getHiredDate() {
        return hiredDate;
    }

    public void setHiredDate(Date hiredDate) {
        this.hiredDate = hiredDate;
    }

    public ArrayList<Student> getAdvisees() {
        return advisees;
    }

    public void setAdvisees(ArrayList<Student> advisees) {
        this.advisees = advisees;
    }

    @Override
    public void Payment() {
        //calculate annual salary
        annualSalary = 30000;
    }

    @Override
    public String Display() {
        return String.format("%s %s\n" +
                        "%s\n" +
                        "%s\n" +
                        "%s\n",
                title, getName(), getID(), getEmail(), getAddress());
    }
}
