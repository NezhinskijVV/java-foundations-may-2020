package overloading;

public class Bar {

    public static void main(String[] args) {
        Bottle.color = "blue";

        Bottle waterBottle = new Bottle("Saint spring", 0.75, "plastic", 8);

        waterBottle.printBottle();
        waterBottle.printBottle(10);
        waterBottle.printBottle(1000);


        Bottle waterBottle2 = new Bottle("Shishkin forest", 0.5, "plastic", 6);
        waterBottle2.printBottle();

        Bottle.color = "green";

        waterBottle.printBottle();
        waterBottle2.printBottle();

    }
}

//INTERFACE pt1
//1. Создать следующие интерфейсы:
//- Walkable с методом void walk()
//- Swimable с методами void swim(), double maxSwimSpeed()
//- Runnable с методами void run(), int maxRunDistance()
//- Flyable с методами void fly() и String flyMaxDistance()
//2. Создать классы: Man (человек), Dog, Cat, Bird, Fish и реализовать соответствующие интерфейсы
// 3. Создать Класс Vodka (4 поля)
//- Перегрузить метод void drinkTooMuch()
//- Перегрузить конструкторы (без ломбок)
//4. Реализовать классы из презентации (в дз)