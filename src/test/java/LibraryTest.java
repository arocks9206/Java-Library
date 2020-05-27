import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book1;
    Book book2;
    Book book3;
    Book book4;
    Book book5;

    @Before
    public void before() {
        library = new Library(4);
        book1 = new Book("Life of Pi", "Yann Martel", "Fiction");
        book2 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "Fiction");
        book3 = new Book("The Children of Men", "P.D. James", "Sci-fi");
        book4 = new Book("Normal People", "Sally Rooney", "Fiction");
        book5 = new Book("Beloved", "Toni Morrison", "Historical Fiction");
    }

    @Test
    public void bookCountStartsAt0(){
        assertEquals(4, library.getCapacity());
    }

    @Test
    public void bookCapacityIs4() {
        assertEquals(4, library.getCapacity());
    }

    @Test
    public void canAddBookToCollection() {
        library.addBook(book1);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void cannotAddBookToCollection() {
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        assertEquals(4, library.bookCount());
    }

    @Test
    public void canLendBook() {
        library.addBook(book1);
        library.lendBook(book1);
        assertEquals(0, library.bookCount());
    }


}
