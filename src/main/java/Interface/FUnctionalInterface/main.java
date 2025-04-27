package Interface.FUnctionalInterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class main {
    public static void main(String[] args) {
//        Eagle e=new Eagle();
//        e.canFly();
//        System.out.println(e.getName("Asian Eagle"));
//        System.out.println("Minmum height to fly "+ e.minmumHeight()+"m");
//
//        System.out.println(Bird.canBreathe()); // since it static method we can call it interface only

    // lambda Expression
        // how can we implemnts ths interface
        // first wa we already cover by creating class and iomplementing

        //Second way using anonymous  class
//        Bird eagle=new Bird() {
//            @Override
//            public void canFly() {
//                System.out.println("Can fly vertically");
//            }
//        };
//        eagle.canFly();

        //Third way using Lambda Expression

        // Lamba expression reduces verbose code in ur programe
        // it only work with functional interface
        // if you only one line code then no need to use brace {} directly you write like this ()-> System.out.print("fly")
//        Bird eagle=()->{
//            System.out.println("Vertical fly");
//        };
//        eagle.canFly();

    // Types of functonal intwerface

//        Interface	        Description	        Abstract Method	                 Example Input → Output
//        Function<T, R> Takes T, returns R	        R apply(T t)	                 String → Integer
//        Predicate<T>	 Takes T, returns boolean	boolean test(T t)	         Integer → true/false
//        Consumer<T>	 Takes T, returns void	    void accept(T t)	             String → print to console
//        Supplier<T>	 Takes nothing,returns T	  T get()                     Random number


        //Uses of functional interface
//        Predicate to filter orders
//
//        Function to transform order data
//
//        Consumer to log or print
//
//        Supplier to generate order IDs


        Function<String, Integer> lengthFunc = s -> s.length();
        System.out.println(lengthFunc.apply("Akash")); // 5


        Predicate<String> isEven=(String S)->{
          if(S.length()%2==0)
              return true;
          else
              return false;
        };
        System.out.println(isEven.test("Akash"));

        Consumer<String> logincheck=(String username)->{
            if(username=="AkashPandit36")
            {
                System.out.println("User found");
            }
            else {
                System.out.println("User is not found");
            }
        };
        logincheck.accept("AkashPandit3");



        Supplier<Double> randomSupplier = () -> Math.random();
        System.out.println(randomSupplier.get());


//        Java has a rich set of functional interfaces to handle common use cases:
//
//        Transform data (Function)
//
//                Validate (Predicate)
//
//        Perform actions (Consumer)
//
//                Generate values (Supplier)
//
//        And more, especially for primitives!

    }
}
