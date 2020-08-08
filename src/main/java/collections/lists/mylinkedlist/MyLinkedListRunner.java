package collections.lists.mylinkedlist;

public class MyLinkedListRunner {

    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.add("Строка 1");
        linkedList.add("Строка 2");

        System.out.println("linkedList.toString() = " + linkedList.toString());

        System.out.println("linkedList.remove(1) = " + linkedList.remove(1));
        System.out.println("linkedList.toString() = " + linkedList.toString());

        System.out.println("linkedList.remove(0) = " + linkedList.remove(0));
        System.out.println("linkedList.toString() = " + linkedList.toString());

        linkedList.add("Строка 1");
        linkedList.add("Строка 2");
        linkedList.add("Строка 3");
        System.out.println("linkedList.toString() = " + linkedList.toString());

        System.out.println("linkedList.remove(1) = " + linkedList.remove(1));
        System.out.println("linkedList.toString() = " + linkedList.toString());
    }
}
//HW: Linked List
// 1. Оставшиеся методы
// 2. Тесты на Linked List
// 3. Двусвязный список
// 4. Дженерики
// 5. релизовать полностью List