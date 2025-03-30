package Constructor;

public class User {

    int age;
    String name;


    User(int age,String name) throws Exception{
        if(age<18){
            throw new Exception("Age shloud be greater than 18 to vote");
        }
        this.age=age;
        this.name=name;
    }
    public void display(){
        System.out.print(age+" "+name);
    }

}
