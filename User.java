package in.riyansh;

public class User
{
    private String name, email;

    public User(String name, String email) {
        this.email = email;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}