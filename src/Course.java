public class Course {
    private String courseName;
    private int numOfCredits;
    private double price;

    public Course() {
        courseName = "";
        numOfCredits = 0;
        price = 0.0;
    }

    public Course(String courseName, int numOfCredits, double price) {
        this.courseName = courseName;
        this.numOfCredits = numOfCredits;
        this.price = price;
    }

    public void Display() {

    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getNumOfCredits() {
        return numOfCredits;
    }

    public void setNumOfCredits(int numOfCredits) {
        this.numOfCredits = numOfCredits;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
