package Methods;



class Car{
    public  final void engine(){
        System.out.print("Diesel engine");
    }
}
class Honda extends Car{


    public void PetrolEngine(){
        System.out.print("Petrol Engine");
    }
}
public class FinalMethod2 {

    public static void main(String[] args) {
       Honda city=new Honda();
       city.PetrolEngine();
    }

}
