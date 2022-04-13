package date;

public class TestDate {
  public static void main(String[] args) {
    // Test constructor and toString()
    Date date = new Date(1, 2, 2014);
    System.out.println(date);

    //Test setters and getters
    date.setDay(9);
    date.setMonth(12);
    date.setYear(2009);
    System.out.println(date);
    System.out.println("Day: " + date.getDay());
    System.out.println("Month: " + date.getMonth());
    System.out.println("Year: " + date.getYear());

    // Test setDate()
    date.setDate(3, 4, 2016);
    System.out.println(date);
  }
}
