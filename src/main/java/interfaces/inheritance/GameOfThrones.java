package interfaces.inheritance;


import interfaces.inheritance.interfaces.Child;
import interfaces.inheritance.interfaces.Grandfather;

public class GameOfThrones {

    public static void main(String[] args) {
//
//        Father jaimy = new Father();
//        Mother cercei = new Mother();
//        Child joffrey = new Child();
//
//        jaimy.giveLove();
//        cercei.giveLove();
//
//        System.out.println("Child");
//        joffrey.giveLove();

        Child joffrey = new Child();
        joffrey.giveLove();
        joffrey.kiss();


    }
}