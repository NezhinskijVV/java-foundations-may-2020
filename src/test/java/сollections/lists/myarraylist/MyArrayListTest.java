package сollections.lists.myarraylist;


import collections.lists.myarraylist.MyArrayList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Класс MyArrayList: ")
public class MyArrayListTest {
    private final static String ELEMENT = "Element";

    @Test
    @DisplayName("корректно добавляет элемент")
    public void shouldCorrectAddElement(){
        MyArrayList list = new MyArrayList();
        list.add(ELEMENT);
        assertEquals(1, list.size());
        assertEquals(ELEMENT, list.get(0));
    }

}