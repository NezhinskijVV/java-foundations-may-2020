package core;

public class CatHouse {

    public static void main(String[] args) { //psvm
        Cat cat = new Cat();

        Lion leo = new Lion();
        leo.sayMeow();


        Cat bagira = new Panther();
        bagira.sayMeow();


        DomesticCat murochka = new DomesticCat("Murochka", 3.0, true);


        System.out.println(murochka.getName());


    }
}
