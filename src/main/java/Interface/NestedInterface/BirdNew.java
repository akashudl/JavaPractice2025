package Interface.NestedInterface;

public class BirdNew {
    public void canfly() {
        System.out.println("Eagle can fly");
    }

    // An interface in a class can have any access modifiers
    private interface NonFlyingBird{
        public void canRun();
    }
}
