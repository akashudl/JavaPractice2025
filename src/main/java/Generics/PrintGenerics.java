package Generics;

//A generic class <T> here we denote with  anyhting with the T it can be a .b c
// And objkect will be raplced by the T
// Only non prmitives value are allowed we can use like interface , abstarct
//Now we don't  need manual type casting
// It is used for type saftey
// it work on run time behind the scene it use type  erasure
//Generics allow you to write type-safe, reusable code where the type of data is a parameter — not hardcoded.

//public class PrintGenerics<T> {
//    T value;
//    public  T getPrintValue(){
//        return  value;
//    }
//    public  void setPrintValue (T value){
//        this.value=value;
//    }
//
//    void print(T val) {
//        System.out.println("Generic print: " + val);
//    }
//
//    //Generic method
////    <T> returntype methodname (T param)
//   static  <T> void newPrint(T newvalue){
//        System.out.println("Colour: "+ newvalue);
//    }
//}




// bounded generics
//  UpperBound means T can be type nubrrer or it is subclass only here super class we can interfac to
public class PrintGenerics<T extends  Number> {

        T value;
    public  T getPrintValue(){
        return  value;
    }
    public  void setPrintValue (T value){
        this.value=value;
    }


}
