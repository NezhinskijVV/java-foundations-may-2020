package object;

public class MyWorkingTable {

    public static void main(String[] args) {
        Pen myFavoritePen = new Pen("Corbina", "blue", 0.8);
        System.out.println("myFavoritePen.toString() = " + myFavoritePen);

        Pen myFavoritePen2 = new Pen("Corbina", "blue", 0.8);

        System.out.println("myFavoritePen.equals(myFavoritePen) = " + myFavoritePen.equals(myFavoritePen));
        System.out.println("myFavoritePen.equals(myFavoritePen2) = " + myFavoritePen.equals(myFavoritePen2));
        System.out.println("myFavoritePen.equals(string) = " + myFavoritePen.equals("myFavoritePen2"));
    }
}
