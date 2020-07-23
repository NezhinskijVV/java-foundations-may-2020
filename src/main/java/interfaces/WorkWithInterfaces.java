package interfaces;

public class WorkWithInterfaces {

    public static void main(String[] args) {

//        Creatable gin = new Gin();
//        gin.createWish();
//
//        Creatable khotabich = new Khotabich();
//        khotabich.createWish();


        Creatable gin = new Khotabich();
        gin.createWish();
//        gin.printName() -- ошибка

        Immortalable gin2 = new Gin();
        gin2.jumpFrom16Floor();
    }
}