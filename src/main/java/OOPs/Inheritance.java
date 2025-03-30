package OOPs;


interface  Dog{
    public void bark();
}
interface Cat{
    public void meows();
}

interface canine extends Cat,Dog{

}

class  Animal implements Cat,Dog{

    @Override
    public void bark() {
        System.out.print("Dog barks");
    }

    @Override
    public void meows() {
        System.out.print("Cat meows");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Dog dog=new Animal();
        dog.bark();
      //dog.meow();
    }
}
