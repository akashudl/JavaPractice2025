package Interface.FUnctionalInterface;



//Functinla interface
//it can only have one abstarct method
// if any interface is only abstarct method it can alos be a functional interface
// @FunctionalInterface you can give ths annotation if needed so that while in compile time if you want to gve more that one abstrarct method
// it will thorw error

@FunctionalInterface
public interface Bird {
    void canFly();

    //void canRun();// thows errors since it an only have one abatsract method

    // In functional interface you can default method ,priavte static mathod also
    default int minmumHeight(){
        return 100;
    }

    default String getName(String name){
        return name;
    }
    static boolean canBreathe(){
        return true;
    }

    // If you define any obect class method as abstract class method in functional interface
    // you dont need to provide mimplemetation of it
    // since all the class if they dont extend any parent  class  it will by default implicity extend object class
    String toString();
}
