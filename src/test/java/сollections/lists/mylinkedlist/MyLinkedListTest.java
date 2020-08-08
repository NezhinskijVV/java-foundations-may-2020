package сollections.lists.mylinkedlist;

import collections.lists.myarraylist.MyArrayList;
import collections.lists.mylinkedlist.MyLinkedList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Класс MyLinkedList :")
public class MyLinkedListTest {

    private final static String ELEMENT = "Element";

    @Test
    @DisplayName("корректно добавляет элемент")
    public void shouldCorrectAddElement(){
        MyLinkedList list = new MyLinkedList();
        list.add(ELEMENT);
        assertEquals(1, list.size());
        assertEquals(ELEMENT, list.get(0));
    }
}
