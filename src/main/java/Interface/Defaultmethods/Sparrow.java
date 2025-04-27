package Interface.Defaultmethods;

public class Sparrow implements Bird {

    @Override
    public int getMiniumFilgHeight(){
        return 200;
    }

    @Override
    public boolean canBreathe() {
        return true;
    }
}
