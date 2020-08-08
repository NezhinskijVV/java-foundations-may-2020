package сollections.lists;

import collections.lists.Book;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;


@DisplayName("В классе Book должен:")
public class BookTest {

    @Test
    @DisplayName(" корректно работать конструктор")
    public void shouldHasGotCorrectConstructor() {
        Book actualBook = new Book("The Lord Of The Rings", "Tolken", 700);

        assertEquals("The Lord Of The Rings", actualBook.getName(), "Некорректное имя");
        assertEquals("Tolken", actualBook.getAuthor());
        assertEquals(700, actualBook.getPagesCount());

//        assertAll(() -> assertEquals("The Lord Of The Ring", actualBook.getName()),
//                () -> assertEquals("Tolken", actualBook.getAuthor()),
//                () -> assertEquals(800, actualBook.getPagesCount()));
    }

    @Test
    @DisplayName(" корректно работать сеттер для кол-ва стр")
    public void shouldHasGotCorrectSetterForPagesCount(){
        Book book = new Book("The Lord Of The Rings", "Tolken", 700);
        book.setPagesCount(800);

        assertEquals(800, book.getPagesCount());
    }

}