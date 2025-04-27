package Generics;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
//        Print printobj=new Print();
//        printobj.setPrintValue(1);
//        Integer printvalue= (Integer) printobj.getPrintValue(); // we need to manually typecast the value
//        System.out.println(printvalue);

        // due to the above problem we use typecasting
//        Generic class help us to write class in a genereic manner thtat helps to avoid the typecasting  that we have to use
//        with object class


        //Generics

//        PrintGenerics<Integer> printGenerics=new PrintGenerics<>();
        // Whatever Primitve value you pass here it gout autoboxed with wrapper calls in generics
//        printGenerics.setPrintValue(10);
//        Integer printgenericsvalue=printGenerics.getPrintValue();
//        System.out.println(printgenericsvalue);
        //Generics Inheritance
//        PrintGenerics<String> printGenerics=new ColorPrint();
//        printGenerics.setPrintValue("Akash"); // Since In color Print we have define generic type as String if here we pass any other type value it will throw error
//        String s=printGenerics.getPrintValue();
//        System.out.println(s);

//        ColorPrint<String>colorPrint =new ColorPrint<>();
//        colorPrint.setPrintValue("fffff");
//        String color=colorPrint.getPrintValue();
//        System.out.println(color);
//        colorPrint.print("Red");

        // Set pair value
//        Pair<Integer,String>p=new Pair<>();
//        p.put(1,"akash");
//        p.put(2,"Sunny");
//        p.displayPair();


        //Generics on method
//        PrintGenerics.newPrint("Red");

        //Raw type
        // In raw type if you dont pass any type as parametrized  while creating object ,java internally passes OBject as parmetrized type
//        PrintGenerics printGenerics=new PrintGenerics();
//        printGenerics.setPrintValue(20);
//        System.out.println(printGenerics.getPrintValue());
//        printGenerics.setPrintValue("Hello");
//        System.out.println(printGenerics.getPrintValue());


        // Bounded Generics
//          PrintGenerics<Integer> printGenerics=new PrintGenerics<>();
//          printGenerics.setPrintValue(20);
//        System.out.println(printGenerics.getPrintValue());
//        printGenerics.setPrintValue("Hello"); // it will throw error since string nis not subclass of number
//        System.out.println(printGenerics.getPrintValue());
//        Report report=new Report();
//        Processor<Report> processor=new Processor<>(report);
//        processor.process();


        // Wilcard
        List<String> strings = List.of("A", "B");
        List<Integer> integers = new ArrayList<>(List.of(1, 2, 3));
        List<Number> numbers = new ArrayList<>();

        WildCardExample.printAll(strings);
        WildCardExample.printNumber(integers);
        //WildCardExample.addIntegers(integers);
//
//        WildCardExample w= new WildCardExample();
//        w.addIntegers(integers);

    }
}
