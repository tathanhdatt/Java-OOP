package mylineandmypoint;

public class Test {
  public static void main(String[] args) {
    MyPoint point1 = new MyPoint(1, 2);
    MyPoint point2 = new MyPoint(2, 4);
    // Test constructors
    MyLine line1 = new MyLine(point1, point2);
    System.out.println(line1);

    // Test setters and getters
    line1.setBegin(new MyPoint(10, 12));
    line1.setEnd(new MyPoint(20, 24));
    System.out.println("Begin point: " + line1.getBegin());
    System.out.println("End point: " + line1.getEnd());

    line1.setBeginX(11);
    line1.setBeginY(13);
    System.out.println("Begin point's x: " + line1.getBeginX());
    System.out.println("Begin point's y: " + line1.getBeginY());
    line1.setEndX(21);
    line1.setEndY(25);
    System.out.println("End point's x: " + line1.getEndX());
    System.out.println("End point's y: " + line1.getEndY());

    line1.setBeginXY(0, 4);
    System.out.println("Begin point's x: " + line1.getBeginXY()[0]);
    System.out.println("Begin point's y: " + line1.getBeginXY()[1]);
    line1.setEndXY(3, 0);
    System.out.println("End point's x: " + line1.getEndXY()[0]);
    System.out.println("End point's y: " + line1.getEndXY()[1]);

    System.out.println("Length: " + line1.getLength());
    System.out.println("Gradient: " + line1.getGradient());

    // Test another constructor
    MyLine line2 = new MyLine(1, 2, 3, 4);
    System.out.println(line2);
  }
}
