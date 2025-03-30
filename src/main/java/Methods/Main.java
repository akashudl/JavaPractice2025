
package Methods;


class example{
    static int a=10;
    public static void display(){

        System.out.println("Helloo from static method");
    }
    public void checkaccess(){
        a=20;
    }
}

class Person {
    public static  void profession(){
        System.out.print("hi I am from person class");
    }
}
class Doctor extends Person{
    public static void profession(){
        System.out.print("hi I am from Doctor class");
    }
}

public class Main {
    public static void main(String[] args) {
        example.display();
        System.out.println(example.a);
        example.a=20;

        Doctor p=new Doctor();
        p.profession();
//        Doctor.profession();
//        Person.profession();
    }
}
