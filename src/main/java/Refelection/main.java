package Refelection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class main {

    //Reflection is a fetaure in java that allow to maipulate inspect classes ,method,fileds at runtime
    //even if you don't know ther name at compile time

    // Implicity java create a Class file of all the the program you execute during rutime
    // Jmv internally create the object of the CLass for each you progmram calss is loaded during runtime
    // This class object conatins metadadta information about the particuklar class like method,field ,constructor,modifiers etc

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {

        //Three ways do reflection
        // Since forname can throw exeception of classnotfound so we need toh handle it
//        Class  eagleclass=Class.forName("Eagle");

//        2nday way
        Class eagle= Eagle.class;

//        3rd way
//        Eagle eagleobj=new Eagle();
//        Class eagle=eagleobj.getClass();

//        If a class has default (package-private) access in Java, Class.getModifiers() will return 0, because no access modifier bit is set.

//        In Java, each modifier (like public, static, etc.) has a special number (a bitwise mask value).
//
//        Example:
//        Modifier	Value
//        public	1
//        private	2
//        protected	4
//        static	8
//        final	    16
//        abstract	1024

        //The package java.lang.reflect  provide CLassess that can be used to access or maniupluate the value in fields,method and class,constructor
//
//        System.out.println(eagle.getName());
//        System.out.println(Modifier.toString(eagle.getModifiers()));


        // If you want to get all the mehtod which are present in the class during runtimee
        //you can use Method-> getmethods of java reklefction to get only public method
        // if you do getmethod on child class Eagle as by default eagle extends obect so object is uper class
        // so all the pubic  method of object class will also get printed
//
//        Method[] methods=eagle.getMethods();
//        for (Method method:methods){
//            System.out.println(method.getName());
//            System.out.println(method.getReturnType());
//            System.out.println(method.getDeclaringClass());
//            System.out.println(method.getModifiers());
//            System.out.println("******************");
//        }

//        // to get private method  alos you need to use
//        // when you use this method it will not show the super mthods
//
//        Method[] Privatemethods=eagle.getDeclaredMethods();
//        for (Method method:Privatemethods){
//            System.out.println(method.getName());
//            System.out.println(method.getReturnType());
//            System.out.println(method.getDeclaringClass());
//            System.out.println(method.getModifiers());
//            System.out.println("******************");
//        }


        //Invoking method using Reflection
        // We need to create object then only we can call method
//        // you can create object with new keyword or using reflection alos you can  create object like below and invoke the methods
//            Class eagleclass=Class.forName("Eagle");
//            Object EagleObject=eagleclass.newInstance();
//
//              // 1. Get and call the no-argument fly() method
//                Method flyMethod = eagleclass.getMethod("fly");
//                flyMethod.invoke(EagleObject); // Outputs: Fly
//
//            Method flymethod1=eagleclass.getMethod("fly",int.class,int.class,int.class);
//            flymethod1.invoke(EagleObject,100,200,10);



//        Reflection of filed
//        Class eagle= Eagle.class;
        //it only show vafribale which are used in eagle class not it super class object
//        Field [] fields=eagle.getFields();
//        for (Field field:fields){
//            System.out.println(field.getName());
//            System.out.println(field.getDeclaringClass());
//            System.out.println(field.getModifiers());
//            System.out.println("******************");
//        }
        // setting the value of priavte fileds
        // it breaks the rule of encapsulation
//        Eagle eagleobj=new Eagle();
//        Field field=eagle.getDeclaredField("canSwim");
//        field.setAccessible(true);
//        field.set(eagleobj,true);
//        System.out.println(field.getBoolean(eagleobj));

        //Reflection of constructor
        // reflection break singleton

//        Class eagle= Eagle.class;
//
//        Constructor [] constructor=eagle.getDeclaredConstructors();
//        for(Constructor constructor1:constructor){
//            System.out.println(Modifier.toString(constructor1.getModifiers()));
//            constructor1.setAccessible(true); // it break the reul of singelton since we are making a consturctor priavte.
//            Eagle eagleobj= (Eagle) constructor1.newInstance();
//            eagleobj.fly();
//        }
//
//        Disadvante of reflection
//                /changes oops behacviour
//                // it is slow
    }
}
