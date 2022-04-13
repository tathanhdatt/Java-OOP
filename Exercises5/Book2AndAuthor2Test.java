public class Book2AndAuthor2Test {
  public static void main(String[] args) {
    // Test Author2 class
    Author2 author = new Author2("Tan Ah Tech", "ahtech@nwhere.com");
    System.out.println(author);

    author.setEmail("ahteck@somewhere.com");
    System.out.println(author);
    System.out.println("Name is: " + author.getName());
    System.out.println("Email is: " + author.getEmail());

    // Test Book2 class
    Book2 book = new Book2("12345", "Java for dummies", author, 8.8, 88);
    System.out.println(book);

    book.setPrice(9.9);
    book.setQty(99);
    System.out.println(book);
    System.out.println("Isbn is: " + book.getIsbn());
    System.out.println("Name is: " + book.getName());
    System.out.println("Price is: " + book.getPrice());
    System.out.println("Qty is: " + book.getQty());
    System.out.println("Author is: " + book.getAuthor());
    System.out.println("Author's name is: " + book.getAuthorName());
    System.out.println("Author's name is: " + book.getAuthor().getName());
    System.out.println("Author's email is: " + book.getAuthor().getEmail());

  }
}
