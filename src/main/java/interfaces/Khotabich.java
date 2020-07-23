package interfaces;

public class Khotabich implements Creatable {

    @Override
    public void createWish() {
        System.out.println("Трах-тебидох");
    }

    public void printName(){
        System.out.println("Я -- Хотабыч! Я лучший джин!");
    }
}
//Creatable gin = new Khotabich();
//gin.printName();