import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class DemoOptional {
  public static void main(String[] args) {
    List<Book> books = new ArrayList<>();
    books.add(new Book("John"));
    books.add(new Book("Mary"));
    books.add(new Book("Peter"));
    books.add(new Book("Sam"));
    books.add(new Book("Joanna"));

    Optional<Book> book = books.stream()  // Optioinal book is not null even not found
    .filter(b -> b.author.startsWith("J"))  //
    .findAny();

    book.ifPresent((b) -> System.out.println("Book found"));

    Optional<Book> book2 = Optional.of(new Book("Eric"));
    // Optional<Book> book3 = Optional.of(null); // runtime error
    Optional<Book> book3 = Optional.ofNullable(null);
    Optional<Book> book4 = Optional.ofNullable(new Book("Anna"));
    Optional<Book> book5 = Optional.empty(); // same as put null

    Book newBook = book5.orElse(new Book("Default"));



  }

  public static Optional<Book> getBook(){
      return Optional.empty();
    }
  
  public static ArrayList<Book> getBookList(){
    return new ArrayList<Book>();
  }
}
