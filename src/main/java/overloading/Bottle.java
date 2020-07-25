package overloading;

//import lombok.AllArgsConstructor;

//@AllArgsConstructor
public class Bottle {
    private final String brand;
    private double volume;
    private final String material;
    private final int highInCm;
    public static String color;


    public Bottle(String brand, double volume, String material, int highInCm) {
        this.brand = brand;
        this.volume = volume;
        this.material = material;
        this.highInCm = highInCm;
    }

    public Bottle(String brand, String material, int highInCm) {
        this.brand = brand;
        this.material = material;
        this.highInCm = highInCm;
    }

    public void printBottle(){
        System.out.println("Я бутылка " + this.toString());
    }

    public void printBottle(int age){
        if (age < 100){
            System.out.println("Я еще жива " + this.toString());
        } else
            System.out.println("Я уже мертва " + this.toString());
    }


    @Override
    public String toString() {
        return "Bottle{" +
                "brand='" + brand + '\'' +
                ", volume=" + volume +
                ", material='" + material + '\'' +
                ", highInCm=" + highInCm +
                ", color=" + color +
                '}';
    }
}
