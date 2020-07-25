package interfaces.inheritance.interfaces;

public interface Father extends Grandfather {

    default void giveLove() {
        System.out.println("Default realisation from Father");
    }
}