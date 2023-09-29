public class BuddyInfo {

    private String name;
    private String address;
    private String number;

// Getter methods

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getNumber() {
        return number;
    }

    // Constructor with parameters
    public BuddyInfo(String name, String address, String number) {
        this.name = name;
        this.address = address;
        this.number = number;
    }

    // Testing testing...

    // Default Constructor
    public BuddyInfo() {
        this.name = "";
        this.address = "";
        this.number = "";
    }





    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Mohannad", "525 elgin st", "(613)-999-9999");

        System.out.println("Hello, " + buddy.getName());
        System.out.println("Address: " + buddy.getAddress());
        System.out.println("Number: " + buddy.getNumber());
    }
}
