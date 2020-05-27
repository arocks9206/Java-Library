import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Book book;
    Library library;

    @Before
    public void before() {
        borrower =  new Borrower("Paige");
        book = new Book("Conversations With Friends", "Sally Rooney", "Fiction");
        library = new Library(4);
        library.addBook(book);
    }

    @Test
    public void canBorrowBook() {
        borrower.borrowBookFromLibrary(library);
        assertEquals(1, borrower.numberOfBorrowedBooks());
    }

    @Test
    public void canReturnBook() {
        borrower.borrowBookFromLibrary(library);
        borrower.returnBookToLibrary(book);
        assertEquals(0, borrower.numberOfBorrowedBooks());

    }




}
