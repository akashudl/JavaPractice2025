package Interface;



//Interfaces  help to achieve abstraction
//Public and Priavte interface are not allowe only pulic and default are allowed
// Help to achieve Run time polymorphism
// Use of interface keyword
// Mutliple inheritance can be achieved through interface only
//method cannot be declare as final
// Fields are public, static ,final implicitaly
//not possible to make filed priavte,proteted
// interfaces in Java can have try-catch blocks — but only inside method bodies like default or static methods. but in java  8+

public interface Car {
    // In ajva 9 it is allowes
    //    private void brakes();
    int max_speed=200;
    public void brakes();
    public void startEngine();
}
