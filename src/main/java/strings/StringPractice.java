package strings;

public class StringPractice {

    public static void main(String[] args) {

        String str = " Я супер-строка!";
        System.out.println("str = " + str);
        str = str.trim();  //immutable
        System.out.println("str = " + str);

        String name = "Vitaliy";
        String nameCopy = "Vitaliy";
        String constrName = new String("Vitaliy");

        System.out.println(name == nameCopy);

        System.out.println(name == constrName);

        constrName = constrName.intern();
        System.out.println(name == constrName);

        name.equals(constrName);

        String str1 = "Я классная строка, поиграйся со мной!";
        System.out.println(str1.trim()); //Это удаление пробелов сначала и с конца


    }
}

// 1. Понять какие модификаторы можно применять (классы, интерфейсы и абстрактные классы)
//final, static и модификаторы доступа
// 2. Поиграться с методами класса String. (кроме CodePoint lines)
// String str = "Я классная строка, поиграйся со мной!"