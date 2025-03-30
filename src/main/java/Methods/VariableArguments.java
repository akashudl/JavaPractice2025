package Methods;

public class VariableArguments {
    public static void sum(int ...variables){
        int output=0;
        for (int i:variables){
            output+=i;
        }
        System.out.println(output);
    }

    public static void multiply(int a,int ...variables){

        int output=1;
        for (int i:variables){
            output*=i;
        }
        System.out.println(a);
        System.out.println(output);
    }

    public static void main(String[] args) {
        sum(1,2,3,4,5,6,7,8,9,10,11,12,13);
        multiply(1,23,23,2,3,2,3,21,23,1,23,1,23,12,3,12,31,2); // this is possible
//        multiply(int ...varaibles,int a); // this is not all possible it will not able to identify till where the last value

    }
}
