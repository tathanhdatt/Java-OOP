package inhertance.persion;

public class Test {
  public static void main(String[] args) {
    Person person = new Person("Name", "address");
    System.out.println(person);

    Student student = new Student("Student", "School", "program", 2000, 20000);
    System.out.println(student);

    Staff staff = new Staff("Staff", "Address", "school", 20000);
    System.out.println(staff);
  }
}
