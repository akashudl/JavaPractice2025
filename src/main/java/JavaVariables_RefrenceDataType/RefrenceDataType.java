package JavaVariables_RefrenceDataType;

import java.util.Arrays;

public class RefrenceDataType {
    public static void main(String[] args) {

        Integer a=100;
        String s="Akash";
        check(s);
        System.out.println(s);
//        Integer b=a;
//         a=sum(a);
//        System.out.println("value of a is "+a);
//        System.out.println("Values of a is "+a + " Value of b is "+b);
//        a=200;
//        System.out.println("Values of a after updating "+a + " Value of b is "+b);
    }
    public static Integer sum(Integer a){
        a+=50;
        System.out.println("value of c is "+a);
        return  a;
    }
    public static  String check(String s){
        s="Sunny";
        System.out.print(s);
        return s;
    }
}
