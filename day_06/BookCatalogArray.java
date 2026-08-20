public class BookCatalogArray{
  public static void main(String[] args) {
    Book[] catalog = {
      new Book("The Best Day of My Life", 63.00),
      new Book("Dark Arts", 100.00),
      new Book("Java Essentials", 75.50)
    };
    for (Book b : catalog) {
      System.out.println("Title: " + b.title + ", Price: " + b.price);
    }
  }
}
public class Book{
  String title; 
  double price;
  Book(String title, double price){
    this.title= title;
    this.price= price;
  }
}