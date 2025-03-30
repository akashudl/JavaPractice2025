package OOPs;


class User{
    private String username;
    private String email;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}



// Data encapsulation is binding the data and code working on the data in a single unit
public class DataEncpsulation {
    public static void main(String[] args) {
            User u=new User();
            u.setUsername("akashudl50");
            u.setEmail("akashudl@50@gmail.com");
            System.out.print(u.toString());
    }
}
