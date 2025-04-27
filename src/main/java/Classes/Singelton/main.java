package Classes.Singelton;

public class main {
    public static void main(String[] args) {
        Dbconnection db=Dbconnection.getInstance();
        System.out.print(db);
    }
}
