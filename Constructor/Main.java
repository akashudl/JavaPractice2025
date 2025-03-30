package Constructor;

public class Main {

    public static void main(String[] args) {
//        Product p=new Product();
//        p.display();
//        Electronics e=new Electronics("Electronics","Samsung Tv 55inch", 80000);
//        e.display();

//        //Singelton patter only obhject will be crated
//       Product p= Product.setProductNameAndPrice("Refrigerator",35990);
//        p.display();
        try{
            User u=new User(-5,"akash");
            u.display();
        }catch(Exception e){
            System.out.print(e.getMessage());
        }




    }

}
