package Classes.Singelton;

public class Dbconnection {
    //Eager intitliaztion
    //makeing constructor private
    // create the object itself with private keywor
    // apublioc static metho to access the object

//    ✅ Pros:
//    Simple to implement.
//    Thread-safe without synchronization.
//    ❌ Cons:
//    Instance is created even if the app never uses it — memory waste for heavy objects.


//
//    private static Dbconnection dbconnection=new Dbconnection();
//    private Dbconnection(){
//        System.out.println("Connection established");
//    }
//
//    public static Dbconnection getInstance(){
//        return dbconnection;
//    }

    // Lazy intilization
    // Solve  eager intiklization problem,
    // Here object will be create when some need or some one call the Dbconnectionm staic method
//    ✅ When to Use It?
//Use Eager Initialization when:
//
//The object is lightweight.
//
//The object is always needed.
//
//You want thread safety without synchronization.

    // Disadvantage  whentwo thread come at a same time to get the object the is object is null first and it will create two object for threads

//    private static Dbconnection dbconnection;
//        private Dbconnection(){
//        System.out.println("Connection established");
//    }
//    public static Dbconnection getInstance(){
//       if(dbconnection==null){
//           dbconnection=new Dbconnection();
//       }
//       return dbconnection;
//    }

    //Synchronized keyword
    // To overcome lazy initlization
    // put  alock on method using  synchronized keyword
    // slow

//        private static Dbconnection dbconnection;
//        private Dbconnection(){
//        System.out.println("Connection established");
//    }
//    synchronized public static Dbconnection getInstance(){
//       if(dbconnection==null){
//           dbconnection=new Dbconnection();
//       }
//       return dbconnection;
//    }
    // Double cheched locking
    // overcome the problem of synchronized which is slow
    // it use store the object in cache
    // slow
    // use volatile keyword which is use to put the object create in memeory not in cahce


//    private static volatile Dbconnection dbconnection;
//    private Dbconnection(){
//        System.out.println("Connection established");
//    }
//    public static Dbconnection getInstance(){
//        if(dbconnection==null){
//            synchronized (Dbconnection.class){
//                if(dbconnection==null){
//                    dbconnection=new Dbconnection();
//                }
//            }
//        }
//        return dbconnection;
//    }
//
//
//}
    // Bill pugh
    //The Bill Pugh Singleton Pattern — one of the cleanest, thread-safe, and lazy-loaded singleton implementations in Java.
    // same like ager initilization but here object is called only when nested class is refeered
//    A static nested class is not loaded into memory until it is referenced.
//The outer class is loaded when your app starts or when first used.
//
//But the inner static class (like SingletonHelper) is not loaded until you explicitly call getInstance() —
// that's when the JVM loads the nested class and creates the instance.

    private static class singletonNested{
        private static Dbconnection dbconnection=new Dbconnection();
    }
    private Dbconnection() {
        System.out.println("Connection established");
    }

    public static Dbconnection getInstance() {
    return singletonNested.dbconnection;
    }

    //Enums  are b default singeloton
    // Enum all constructor are proivate
    //only one object creaed of enum as per jvm
    // so by default enum are singelton only
}
