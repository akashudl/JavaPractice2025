package Interface.StaticMethod;

public interface Bird {
    // Static method declera in interface can have implemtaion details and also it can be called directly with interface naem
    public static  boolean canBreathe(){
        return true;
    }

    public  default void minimumHeight(){
        myprivatemethod();
        myprivatestaticmethod();
        mystaticPublicmethod();
    }

    //Private method and private static method introduced in java 9
    void canfly();

     static void mystaticPublicmethod(){ // from sttaic we cna call other statci metghod oly
     myprivatestaticmethod();
    }
    private void myprivatemethod(){

    }

    private static void myprivatestaticmethod(){

    }

}
