public class Book {
  private String name;
  private Author author;
  private double price;
  private int qty;

  public Book(String name, Author author, double price) {
    this.name = name;
    this.author = author;
    this.price = price;
  }

  public Book(String name, Author author, double price, int qty) {
    this.name = name;
    this.author = author;
    this.price = price;
    this.qty = qty;
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

  @Override
  public String toString() {
    return String.format(
      "Book[name=%s, Author[name%s, email=%s, gender=%s], price=%.2f, qty=%d]",
      this.name,
      this.author.getName(),
      this.author.getEmail(),
      this.author.getGender(),
      this.price,
      this.qty
    );
  }

  public String getAuthorName() {
    return this.author.getName();
  }

  public String getAuthorEmail() {
    return this.author.getEmail();
  }

  public char getAuthorGender() {
    return this.author.getGender();
  }
}
