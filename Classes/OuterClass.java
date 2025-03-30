package Classes;

public class OuterClass {

    int instanceVraible=10;
    static int classInstanceVariable=20;



    // Private stacic class Inner class and Static inner class exapmple
//    static class NestedClass{
//        public void print(){
//            System.out.println(classInstanceVariable);
//        }
//    }

//    private static class NestedClass2{
//        public void print(){
//            System.out.println(classInstanceVariable);
//        }
//    }

//    public void display(){
//        NestedClass2 nestedClass2=new NestedClass2();
//        nestedClass2.print();
//    }


    //Non static inner class
    // here you can access both classInstanceVariable and instanceVraible
//    class Innerclass{
//        public void print(){
//            System.out.println(classInstanceVariable+" "+instanceVraible);
//        }
//    }

    //Local innerclass
    //These classes which are defined in any of the block like for loop,whike,do whikl,if else nmethod etc
    // it can be declared in priavte protected and publicy
    // it can invoked inside  the block once the block end the scope of ocal inner class is also end

    public void display(){

        int methodVariable=3;
        class LocalInnerClass{
            int LocalInnervariable=4;

//            A local inner class cannot have static members (except static final constants).
//
//            A local inner class cannot have static methods.
            //Since my jave version is above 16 it is working as  Java 16+ introduced JEP 395: Records, which improved local classes.



            static int staticLocalVarible=5;
            public void print (){
                System.out.print(instanceVraible+" "+classInstanceVariable+" "+methodVariable+" "+LocalInnervariable+" "+staticLocalVarible);
            }

            static void staticMethod() {
                System.out.println("Static method inside Local Inner Class");
            }
        }
        LocalInnerClass localInnerClass=new LocalInnerClass();
        localInnerClass.print();

    }
    /// Inheriatnce in nested class
     //without static
    class InnerClass1{
        int innerclass1=3;

    }

    class InnerClass2 extends InnerClass1{
        int innerClass2=4;

        void display(){
            System.out.println(innerclass1+" "+innerClass2+" "+instanceVraible+" "+classInstanceVariable);
        }
    }

    //static innerclaass inheritaed by different class

    static class NestedClass{
        public void display(){
            System.out.print("inside static nested class");
        }
    }

}
