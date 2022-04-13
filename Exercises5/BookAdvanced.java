public class BookAdvanced {
  private String name;
  private Author[] authors;
  private double price;
  private int qty = 0;

  public BookAdvanced(String name, Author[] authors, double price) {
    this.name = name;
    this.authors = authors;
    this.price = price;
  }

  public BookAdvanced(String name, Author[] authors, double price, int qty) {
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
    str.append("Book[name=").append(this.name).append(", authors={\n");

    for (Author author : authors) {
      str.append(author).append(",\n");
    }
    str.deleteCharAt(str.length() - 2);
    str.append("}, price=").append(this.price).append(", qty=").append(this.qty);

    return str.toString();
  }

  public String getAuthorNames() {
    StringBuilder authorNames = new StringBuilder();
    for (Author author : authors) {
      authorNames.append(author.getName()).append(", ");
    }
    authorNames.deleteCharAt(authorNames.length() - 2);
    return authorNames.toString();
  }
}
