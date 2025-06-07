package Interface.NestedInterface;

public class Eagle implements Bird , Bird.NonFlyingBird {
    @Override
    public void canfly() {
        System.out.println("Eagle can fly");
    }

    @Override
    public void canRun() {
        System.out.println("Egale can run");
    }
}
