package Task_1;

public class Customer {

    private String firstName;
    private String lastName;
    private String userName;
    int id;
    static int counter;

    Customer(String firstName, String lastName, String userName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        counter += 1;

        id = counter;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " " + userName + " " + id;

    }

}