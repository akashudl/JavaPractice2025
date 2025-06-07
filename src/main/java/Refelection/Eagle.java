package Refelection;

public  class Eagle {


    private Eagle() {
    }

    public String breed;
    private boolean canSwim;

    public void fly (){
        System.out.println("Fly");
    }

    public void fly(int highspeed,int distance ,int height){
        System.out.println(highspeed+" "+distance+" "+height);
    }
    private void eat(){
        System.out.println("Eat");
    }
}
