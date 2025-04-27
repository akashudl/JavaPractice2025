package Interface.NestedInterface;

public class Ostrich implements Bird.NonFlyingBird {
    @Override
    public void canRun() {
        System.out.println("Ostrich can run fast");
    }
}
