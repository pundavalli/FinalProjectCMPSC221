public abstract class People implements Payable {
    private String name, ID, email, address;
    private int phoneNum;

    public People() {
    }

    public People(People other) {
        this.name = other.name;
        this.ID = other.ID;
        this.email = other.email;
        this.address = other.address;
        this.phoneNum = other.phoneNum;
    }

    public People(String name, String ID, String email, String address, int phoneNum) {
        this.name = name;
        this.ID = ID;
        this.email = email;
        this.address = address;
        this.phoneNum = phoneNum;
    }

    public abstract void Display();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }
}
