package authorandbook2;

public class Book {
  private String isbn;
  private String name;
  private Author author;
  private double price;
  private int qty;

  public Book(String isbn, String name, Author author, double price) {
    this.isbn = isbn;
    this.name = name;
    this.author = author;
    this.price = price;
  }

  public Book(String isbn, String name, Author author, double price, int qty) {
    this.isbn = isbn;
    this.name = name;
    this.author = author;
    this.price = price;
    this.qty = qty;
  }

  public String getIsbn() {
    return isbn;
  }

  public String getName() {
    return name;
  }

  public Author getAuthor() {
    return author;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public int getQty() {
    return qty;
  }

  public void setQty(int qty) {
    this.qty = qty;
  }

  public String getAuthorName() {
    return author.getName();
  }

  @Override
  public String toString() {
    return String.format(
      "Book[isbn=%s, name=%s, %s, price=%.2f, qty=%d]",
      isbn, name, author, price, qty
    );
  }
}
