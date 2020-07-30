package collections.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListPractice {

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        Book harryPotter1 = new Book("Philosopher's stone", "J. Rowling", 300);
        Book harryPotter2 = new Book("Secret room", "J. Rowling", 350);
        Book harryPotter3 = new Book("Azkaban prisoner", "J. Rowling", 300);

//        books.add(new Object());

        books.add(harryPotter1);
//        books.add(harryPotter1);
//        books.add(harryPotter1);
        books.add(harryPotter2);
        books.add(harryPotter3);


//        for (Book booksElem : books){
//            System.out.print(booksElem + " ");
//        }
//        System.out.println();

        System.out.println(books);

        books.remove(0);

        System.out.println(books);

        System.out.println("books.get(0) = " + books.get(0));

        System.out.println("books.isEmpty() = " + books.isEmpty());

        books.remove(0);
        books.remove(0);

//        books.removeAll(Arrays.asList({harryPotter2,harryPotter3}))
        System.out.println("books.isEmpty() = " + books.isEmpty());

        books.add(harryPotter2);
        books.add(0,harryPotter1);

        System.out.println(books);

        books.remove(harryPotter2);

        System.out.println(books);

    }
}


//Списки:
//
//0. Содание списков: (Используя конструктор)
//а). Создать пустой список
//б). Создать список размером 20
//
//1. Получить элемент по индексу:
//а). Получить первый элемент
//б). Получить последний элемент
//
//2. Задачи на вставку элемента:
//а) Добавить подряд 5 элементов.
//б) Добавить шестой элемент в третию позицию. Добавить седьмой элемент в первую позицию.
//в) Записать в новый список все элементы предыдущего списка.
//
//3. Задачи на удаление элементов: (Используя методы)
//а) Удалить элемент по значению
//б) Удалить элемент по индексу
//
//4. Проверить наличие элемента
//
//5. Вывод списка:
//а) Вывести список на экран в формате: List: {"First";"Second";"Third"}
//
//6. Отфильтровать список вернуть записи по некоторому условию:
//а) Условие на индекс: Индекс делится на 3
//б) Условие на значение: Вернуть количество элементов, которые равны "***"
//
//7. Пропустить несколько первых элементов
//а) Пропустить первые 3 элемента в списке.
//
//6 + 7: Пропускаем элементы, которые удовлетворяют некоторому условию
//а) Пропустить первые 2 элемента, которые равные "****"
//
//8. Вернуть первый подходящий элемент:
//а) Возращаем Первый элемент Делящийся на 3.
//
//9. Возвращаем все элементы удовлетворяющие условию:
//а) Возвращаем все элементы делящиеся на 3
//
//10. Создать класс Person.
//Вернуть всех военнообязанных мужчин (пол), которым меньше 27 и больше 18 и имя которых начинается на Н
//
//11. Найти средний возраст всех женщин.