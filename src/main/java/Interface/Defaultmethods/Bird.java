package Interface.Defaultmethods;

public interface Bird extends LivingThings {


    //Before Java 8 interface was allowed only abstract method but in java 9 abstarct can hae deafult methoed with returm
    public default  int getMiniumFilgHeight(){
        return 100;
    }

    boolean canBreathe();
//    default boolean canBreathe(){
//        return true;
//    }
}
