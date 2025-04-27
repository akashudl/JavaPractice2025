package Classes;



interface dummy{
    public void dummymethod3();
}

public enum EnumMethodOverride implements dummy{
    Monday{
        @Override
        public void dummymethod2() {

        }

        @Override
        public void dummyMethod(){
            System.out.print("Monday Dummy Method");
        }

    },

    Tuesday{
        @Override
        public void dummymethod2() {

        }

    },
    Wednesday{
        @Override
        public void dummymethod2() {

        }

    };

@Override
public void dummymethod3(){

}
    public abstract void dummymethod2();

    public void dummyMethod(){
        System.out.print("Defaut Dummy Method");
    }

}
