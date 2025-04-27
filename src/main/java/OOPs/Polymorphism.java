package OOPs;

class Add{


    public int sum(int a,int b){
        return a+b;
    }


    public double sum (double a, double b){
        return  a+b;
    }

}


public class Polymorphism {
    public static void main(String[] args) {
        Add s=new Add();
        // Compile time polymorphism
        s.sum(5,6);
        System.out.println( s.sum(5.00,6.00));
    }


}
