import org.junit.*;
import static org.junit.Assert.assertEquals;

public class LibraryTest {

  Library library;
  Book book;

  @Before
  public void before(){
    this.library = new Library("Kayla's Books");
    this.book = new Book("The Great Gatsby", "F. Scott Fitzgerald");
  }

  @Test
  public void hasName(){
    String name = library.getName();
    assertEquals("Kayla's Books", name);
  }

  @Test
  public void addingABook(){
    assertEquals(0, library.booksCount());
    library.addBook(book);
    assertEquals(1, library.booksCount());
  }

}
