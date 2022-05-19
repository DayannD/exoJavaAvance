package jdbc;

public class Client {
    private int id;
    private String companyName;
    private String firstName;
    private String email;
    private String phone;
    private String address;
    private String zipCode;
    private String city;
    private byte state;

    public Client(int id, String companyName, String firstName, String email, String phone, String address, String zipCode, String city, byte state) {
        this.id = id;
        this.companyName = companyName;
        this.firstName = firstName;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.zipCode = zipCode;
        this.city = city;
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getCity() {
        return city;
    }

    public byte getState() {
        return state;
    }


    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", companyName='" + companyName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", city='" + city + '\'' +
                ", state=" + state +
                '}';
    }
}
