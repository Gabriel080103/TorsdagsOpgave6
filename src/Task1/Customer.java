package Task1;

public class Customer {
    private String firstName;
    private String lastName;
    private String username;
    private int id;
    private static int counter = 1;

    // 1.b Constructor
    public Customer(String firstName, String lastName, String username) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;

        // 1.c Assign ID and increment counter
        this.id = counter++;
    }

    // 1.d toString method
    @Override
    public String toString() {
        return "Customer ID: " + id + "\n" +
                "Name: " + firstName + " " + lastName + "\n" +
                "Username: " + username + "\n";
    }

    // Getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getId() {
        return id;
    }
}
