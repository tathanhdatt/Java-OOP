package composition.pointandline;

public class TestLineSub {
  public static void main(String[] args) {
    // test constructor
    LineSub lineSub1 = new LineSub(1, 1, 2, 2);
    System.out.println(lineSub1);

    Point begin = new Point(2, 2);
    Point end = new Point(4, 4);
    LineSub lineSub2 = new LineSub(begin, end);
    System.out.println(lineSub2);

    // test getLength() and getGradient()
    System.out.println("Length: " + lineSub1.getLength());
    System.out.println("Gradient: " + lineSub1.getGradient());
  }
}
