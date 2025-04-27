package Interface;

public class Audi implements Car{
    @Override
    public void brakes() {
        System.out.println("Applying brake");
    }

    @Override
    public void startEngine() {
        System.out.println("Starting the engine");
    }

    public void maxspeed(){
        System.out.println("Max Speed :- "+ max_speed);
    }
}
