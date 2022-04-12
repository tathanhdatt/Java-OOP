public class TimeTest {
  public static void main(String[] args) {
    // Test constructors and toString()
    Time time = new Time(1, 2, 3);
    System.out.println(time);

    // Test setters and getters
    time.setHour(4);
    time.setMinute(5);
    time.setSecond(6);
    System.out.println(time);
    System.out.println("Hour: " + time.getHour());
    System.out.println("Minute: " + time.getMinute());
    System.out.println("Second: " + time.getSecond());

    // Test setTime()
    time.setTime(23, 59, 58);
    System.out.println(time);

    // Test nextSecond()
    System.out.println(time.nextSecond());
    System.out.println(time.nextSecond().nextSecond());

    // Test previousSecond()
    System.out.println(time.previousSecond());
    System.out.println(time.previousSecond().previousSecond());
  }
}
