package OOPs;

class Add{


    public int sum(int a,int b){
        return a+b;
    }

    public double sumdouble (double a, double b){
        return  a+b;
    }

}


public class Polymorphism {
    public static void main(String[] args) {
        Add s=new Add();
        // Compile time polymorphism
        s.sum(5,6);
        s.sumdouble(5.00,6.00);
    }


}
