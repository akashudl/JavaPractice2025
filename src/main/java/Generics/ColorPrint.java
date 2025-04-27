package Generics;




// WhenEver you ingherit child class or subclass is non-generic than ou need to define
// weather the type  of T at extending itself

//NOn Generic subclass
//public class ColorPrint extends PrintGenerics<String>{
//
//}



// For generic sub class can specify the type of  T  at the time of object creation
//the generic type T is passed to the superclass.
//When you write:
//
//java
//ColorPrint<String> colorPrint = new ColorPrint<>();
//You're telling the compiler:
//
//        "Hey, I'm creating a ColorPrint that works with String, so that same type T should apply to PrintGenerics<T> as well."
//
//So under the hood, you're effectively doing:
//class ColorPrint<String> extends PrintGenerics<String>

//🧠 The type T = String flows from subclass to superclass automatically.
//public class ColorPrint<T> extends PrintGenerics<T>  {
//}