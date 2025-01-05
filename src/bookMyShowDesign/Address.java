package bookMyShowDesign;

public class Address {
    private String addressId;
    private String street;
    private String city;
    public Address(String addressId, String street, String city) {
        this.addressId = addressId;
        this.street = street;
        this.city = city;
    }
    public String getAddressId() {
        return addressId;
    }
    public String getStreet() {
        return street;
    }
    public String getCity() {
        return city;
    }

}
