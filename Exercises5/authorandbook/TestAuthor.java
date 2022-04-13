package authorandbook;

public class TestAuthor {
  public static void main(String[] args) {
    // Test constructor
    Author ahTech = new Author("Tan Ah Tech", "ahtech@nowhere.com", 'm');
    // Test toString()
    System.out.println(ahTech);
    // Test getters
    System.out.println("Name is: " + ahTech.getName());
    System.out.println("Email is: " + ahTech.getEmail());
    System.out.println("Gender is: " + ahTech.getGender());

  }
}
