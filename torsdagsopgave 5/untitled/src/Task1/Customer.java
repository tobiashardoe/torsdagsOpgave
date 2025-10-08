package Task1;
// task 1.a
public class Customer {
    private String firstName;
    private String lastName;
    private String username;
    private int id;
    private static int counter;

// task 1.b & c
    public Customer(String firstName, String lastName, String username) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        counter++;
        this.id=counter;
    }

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

    public void setId(int id) {
        this.id = id;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Customer.counter = counter;
    }
    // task 1.d
    @Override
    public String toString() {
        return "Customer: " + id +
                "\nName: " + firstName + " " + lastName +
                "\nusername: " + username;
    }
}
