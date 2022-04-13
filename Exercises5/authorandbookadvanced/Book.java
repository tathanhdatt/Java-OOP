package authorandbookadvanced;

public class Book {
  private String name;
  private Author[] authors;
  private double price;
  private int qty = 0;

  public Book(String name, Author[] authors, double price) {
    this.name = name;
    this.authors = authors;
    this.price = price;
  }

  public Book(String name, Author[] authors, double price, int qty) {
    this.name = name;
    this.authors = authors;
    this.price = price;
    this.qty = qty;
  }

  public String getName() {
    return name;
  }

  public Author[] getAuthors() {
    return authors;
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
    StringBuilder str = new StringBuilder();
    str.append("Book[name=").append(name).append(", authors={\n");

    for (Author author : authors) {
      str.append(author).append(",\n");
    }
    int lenStr = str.length();
    str.deleteCharAt(lenStr - 2);
    str.append("}, price=").append(price).append(", qty=").append(qty);

    return str.toString();
  }

  public String getAuthorNames() {
    StringBuilder authorNames = new StringBuilder();
    for (Author author : authors) {
      authorNames.append(author.getName()).append(", ");
    }
    int lenAuthorNames = authorNames.length();
    authorNames.delete(lenAuthorNames - 2, lenAuthorNames);
    return authorNames.toString();
  }
}
