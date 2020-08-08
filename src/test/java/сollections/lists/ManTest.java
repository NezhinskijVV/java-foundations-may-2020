package сollections.lists;


import collections.lists.Book;
import collections.lists.Man;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("В классе Man должен:")
public class ManTest {

    @Test
    @DisplayName(" корректно работать конструктор")
    public void shouldHasGotCorrectConstructor() {
        Man actualMan = new Man("Rowling");
        assertEquals("Rowling", actualMan.getName());
    }

    @Test
    @DisplayName(" корректно работать метод может выпить")
    public void shouldHasGotCorrectMethodDrink(){
        Man man = new Man("Rowling");

        assertTrue(man.canDrink());
    }
}
