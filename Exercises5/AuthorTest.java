public class AuthorTest {
  public static void main(String[] args) {
    // Test constructor
    Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
    // Test toString()
    System.out.println(ahTeck);
    // Test getters
    System.out.println("Name is: " + ahTeck.getName());
    System.out.println("Email is: " + ahTeck.getEmail());
    System.out.println("Gender is: " + ahTeck.getGender());

  }
}
