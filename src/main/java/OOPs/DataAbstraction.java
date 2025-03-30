package OOPs;

abstract class Authentication{

    public abstract  boolean login(String username, String password); // abstract methods

    public abstract String logout();

    public void showWelcomeMessage (){
        System.out.print("This the authentication System");
    }

}

class SecureAuthentication extends Authentication{
   private String Storedusername="akashudl50";
    private String Storedpassword="iamakash";

    @Override
    public boolean login(String username, String password) {
        if(Storedusername.equals(username)&&Storedpassword.equals((password)))
            return true;
        else
            return false;
    }

    @Override
    public String logout() {
       return "User have been successfully logout";
    }
}

//The actual storage of usernames and passwords (storedUsername and storedPassword) is hidden inside the SecureAuthentication class.
//Users interact with the system only through the exposed abstract methods (login() and logout()),
//without knowing how authentication is implemented.



public class DataAbstraction {

    public static void main(String[] args) {
        Authentication auth=new SecureAuthentication();
        if(auth.login("akashudl50","iamakash"))
            System.out.println("User Sucessfully logged in");
        else
            System.out.println("Username and password does not match");

        System.out.print(auth.logout());
    }
}
