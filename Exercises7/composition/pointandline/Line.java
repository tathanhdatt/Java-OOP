package composition.pointandline;

public class Line {
  private Point begin;
  private Point end;

  public Line(Point begin, Point end) {
    this.begin = begin;
    this.end = end;
  }

  public Line(int beginX, int beginY, int endX, int endY) {
    this.begin = new Point(beginX, beginY);
    this.end = new Point(endX, endY);
  }

  public Point getBegin() {
    return begin;
  }

  public void setBegin(Point begin) {
    this.begin = begin;
  }

  public Point getEnd() {
    return end;
  }

  public void setEnd(Point end) {
    this.end = end;
  }

  public int getBeginX() {
    return begin.getX();
  }

  public void setBeginX(int x) {
    begin.setX(x);
  }

  public int getBeginY() {
    return begin.getY();
  }

  public void setBeginY(int y) {
    begin.setY(y);
  }

  public int getEndX() {
    return end.getX();
  }

  public void setEndX(int x) {
    end.setX(x);
  }

  public int getEndY() {
    return end.getY();
  }

  public void setEndY(int y) {
    end.setY(y);
  }

  public int[] getBeginXY() {
    return new int[]{begin.getX(), begin.getY()};
  }

  public void setBeginXY(int x, int y) {
    begin.setXY(x, y);
  }

  public int[] getEndXY() {
    return new int[]{end.getX(), end.getY()};
  }

  public void setEndXY(int x, int y) {
    end.setXY(x, y);
  }

  public double getLength() {
    double xDiff = this.begin.getX() - this.end.getX();
    double yDiff = this.begin.getY() - this.end.getY();
    return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
  }

  public double getGradient() {
    int xDiff = getEndX() - getBeginX();
    int yDiff = getEndY() - getBeginY();
    return Math.atan2(yDiff, xDiff);
  }

  @Override
  public String toString() {
    return "Line[begin=" + begin + ", end=" + end + ']';
  }
}