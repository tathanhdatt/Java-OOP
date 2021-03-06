package authorandbook;

public class TestBook {
  public static void main(String[] args) {
    // AuthorAndBook.Author
    Author ahTech = new Author("Tan Ah Tech", "ahtech@nowhere.com", 'm');
    System.out.println(ahTech);

    // Test constructor and toString()
    Book dummyBook = new Book("Java for dummy", ahTech, 19.95, 99);
    System.out.println(dummyBook);

    // Test getters and setters
    dummyBook.setPrice(29.95);
    dummyBook.setQty(28);
    System.out.println("Name is: " + dummyBook.getName());
    System.out.println("Price is: " + dummyBook.getPrice());
    System.out.println("Qty is: " + dummyBook.getQty());
    System.out.println("Author is: " + dummyBook.getAuthor());
    System.out.println("Author's name is: " + dummyBook.getAuthor().getName());
    System.out.println("Author's email is: " + dummyBook.getAuthor().getEmail());

    Book anotherBook = new Book(
      "More Java",
      new Author("Paul Tan", "Pau@somewhere.com", 'm'),
      29.95
    );
    System.out.println(anotherBook);

    System.out.println("Author's name: " + anotherBook.getAuthorName());
    System.out.println("Author's email: " + anotherBook.getAuthorEmail());
    System.out.println("Author's gender: " + anotherBook.getAuthorGender());
  }
}
