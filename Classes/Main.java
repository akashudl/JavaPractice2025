package Classes;

public class Main {
    public static void main(String[] args) {
//        OuterClass.NestedClass nestedobj=new OuterClass.NestedClass();
//        nestedobj.print();

//        OuterClass outerClass =new OuterClass() ;
//        outerClass.display();


        //no static inner cllaas invoatcion
//        OuterClass outerClassobj=new OuterClass();
//        OuterClass.Innerclass innerclass=outerClassobj.new Innerclass();
//        innerclass.print();

        //OuterClass outerClass=new OuterClass();
       // outerClass.display();

//        OuterClass outerClass =new OuterClass();
//        OuterClass.InnerClass2 innerClass2=outerClass.new InnerClass2();
//        innerClass2.display();

//
//            SomeOtherClass someOtherClass=new SomeOtherClass();
//            someOtherClass.display();


            ///Anonymus class
        // any classs without a name is claeed anaonymus class
        // when you want to override the methods of the class without creating tthe subclass for it
            Car Audi=new Car() {
                @Override
                public void speed() {
                    System.out.println("Average speed of audi is 256KM/Hr");
                }
            };
        Audi.speed();
    }



}
