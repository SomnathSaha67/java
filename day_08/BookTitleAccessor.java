import java.util.ArrayList;
import java.util.Arrays;

public class BookTitleAccessor{
  public static void main(String[] args) {
    ArrayList<String> bookTitles = new ArrayList<>(Arrays.asList(
            "The Great Gatsby",
            "To Kill a Mockingbird",
            "1984",
            "Pride and Prejudice",
            "Moby Dick"
    ));
    System.out.print(bookTitles.get(2));
  }
}