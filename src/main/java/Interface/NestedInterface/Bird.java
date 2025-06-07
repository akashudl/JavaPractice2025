package Interface.NestedInterface;


//Nested interface decalere within another interface
//Nested interface declared within a class


// Nested interface decaled with a class must be public
// Nested interface can have access odifiers
// If you are implementeing outer interface then only you need to provide implementation of outer interface method and
// vice versa of inner interface


import Interface.Car;

public interface Bird  {
    //
    public void canfly();
//    Nested interface under an interface can only be public
    public interface NonFlyingBird{
      public  void canRun();
    }

    //Before Java 8 interface was allowed only abstract method but in java 9 abstarct can hae deafult methoed with returm
    public default  int getMiniumFilgHeigh(){
        return 100;
    }
}
