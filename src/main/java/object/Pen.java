package object;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@AllArgsConstructor
@Getter
public class Pen {
    private final String firm;
    private String color;
    private double diameter;

    @Override
    public String toString() {
        return "Ручка фирмы: \'" + firm + '\'' +
                ", цвета: '" + color + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pen)) return false;

        Pen pen = (Pen) o;

        if (Double.compare(pen.diameter, diameter) != 0) return false;
        if (!firm.equals(pen.firm)) return false;
        return color != null ? color.equals(pen.color) : pen.color == null;
        //тернарный оператор
    }

    @Override
    public int hashCode() {
        return firm.hashCode();
    }
}

//hw:
//1. Явное и неявное приведение типов
//2. Раннее и позднее связывание (прочесть)
//3. Прочесть презентацию, Класс Object + Эккель (статьи) Что делают методы?
//4. toString() реализовать для всех классов по предыдущей домашней работе
//5. hashCode equals определить для класса "Контакт" из Волка с Уолл Стрит
//
//Материалы:
//0. Про раннее и позднее связывание советую почитать Брсюса Экселя Глава Полиморфизм либо в словарике конце можете поискать ( у меня 201 страница в 4 издании)
//1. https://www.geeksforgeeks.org/difference-between-earl..
//2. https://javarush.ru/groups/posts/439-razlichija-mezhd..
//3. Явное и неявное приведение типов: https://metanit.com/java/tutorial/2.2.php