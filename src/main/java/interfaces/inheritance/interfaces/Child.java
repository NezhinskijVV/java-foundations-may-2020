package interfaces.inheritance.interfaces;

public class Child extends Mother implements Father {

    @Override
    public void kiss() {
        System.out.println("Kiss");
    }

//    @Override
//    public void giveLove() {
//        System.out.println("Big Love from Child");
//    }
}
