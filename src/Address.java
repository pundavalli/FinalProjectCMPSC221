public class Address {
    int house_number, zip_code;
    String street, town, state;

    public Address(int house_number, String street, String town, String state, int zip_code) {
        this.house_number = house_number;
        this.street = street;
        this.town = town;
        this.state = state;
        this.zip_code = zip_code;
    }

    @Override
    public String toString() {
        return String.format("%d %s\n" +
                        "%s, %s\n" +
                        "%d",
                house_number, street, town, state, zip_code);
    }
}
