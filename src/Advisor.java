import java.util.Date;

public class Advisor extends People {
    private String title;
    private double annualSalary;
    private Date hiredDate;
    private Student[] advisees;

    public Advisor() {
        title = "";
        annualSalary = 0.0;
        hiredDate = null;
        advisees = null;
    }

    public Advisor(People person, String title, double annualSalary, Date hiredDate, Student[] advisees) {
        super(person);
        this.title = title;
        this.annualSalary = annualSalary;
        this.hiredDate = hiredDate;
        this.advisees = advisees;
    }

    public Advisor(String name, String ID, String email, String address, int phoneNum, String title, double annualSalary, Date hiredDate, Student[] advisees) {
        super(name, ID, email, address, phoneNum);
        this.title = title;
        this.annualSalary = annualSalary;
        this.hiredDate = hiredDate;
        this.advisees = advisees;
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

    public Student[] getAdvisees() {
        return advisees;
    }

    public void setAdvisees(Student[] advisees) {
        this.advisees = advisees;
    }

    @Override
    public void Payment() {

    }

    @Override
    public void Display() {

    }
}
