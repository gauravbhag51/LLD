package StackOverflow;

public class User {
    private static int userCount = 0;
    private final int id;
    private String firstName;
    private String lastName;
    private String username;

    public User(String firstName, String lastName, String username){
        this.id = userCount;
        userCount++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
