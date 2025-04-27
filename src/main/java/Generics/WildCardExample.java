package Generics;

import java.util.List;

public class WildCardExample {
//    In Java Generics, a wildcard is represented by a question mark: ?
////    It means: "I don't know the exact type — but I still want to accept it under certain rules

//    ✅ 1. Unbounded Wildcard – <?>
//    Accept any type (literally: “I don’t care what the type is”).


    public static void printAll(List<?> list){
        for (Object obj : list) {
            System.out.println(obj);
        }

    }
    // Upper-Bounded Wildcard – <? extends Type>
    // Accept Type or any subclass of it.
    public static void printNumber(List <? extends Number> list){
        for(Number n:list){
            System.out.println(n);
        }
    }
    //  Lower-Bounded Wildcard – <? super Type>
    //  Accept Type or any superclass of it.
    public   void addIntegers(List<? super Integer> list) {
        list.add(42);
        list.add(99);
    }
}
