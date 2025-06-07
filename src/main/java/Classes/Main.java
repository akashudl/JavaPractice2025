package Classes;

public class Main {
    public static void main(String[] args) {
//        In Java, a top-level class cannot be private; it can only be public or package-private. However, nested (inner) classes can be declared private if needed.
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
//            Car Audi=new Car() {
//                @Override
//                public void speed() {
//                    System.out.println("Average speed of audi is 256KM/Hr");
//                }
//            };
//        Audi.speed();


        // POJO class criteria
        // Stands for plan old java object
        // it contains a default no argument constructor
        // no annotation in the pojo class  @entitiy,@table etc
//        Pojoclass p=new Pojoclass();
//        p.setAddress("Andal");
//        p.setRollNumber(1);
//        p.setName("Akash");
//       p.display();


        //ENUM
//        for(Enum sample:Enum.values()){
//
//            System.out.println(sample.name()+" "+sample.ordinal());
//        }
//        System.out.println(Enum.valueOf("Friday"));

        // ENum with custom values

//        Enum day=Enum.Tuesday;
//        System.out.println(day.getComment());
//        System.out.println(day.getVal());
//        System.out.print(day.ordinal());


        //Enum override
      EnumMethodOverride.Tuesday.dummyMethod();

    }



}
