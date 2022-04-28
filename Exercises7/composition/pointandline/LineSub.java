package composition.pointandline;

public class LineSub extends Point {
  private Point end;

  public LineSub(int beginX, int beginY, int endX, int endY) {
    super(beginX, beginY);
    this.end = new Point(endX, endY);
  }

  public LineSub(Point begin, Point end) {
    super(begin.getX(), begin.getY());
    this.end = end;
  }

  public Point getBegin() {
    return new Point(super.getX(), super.getY());
  }

  public Point getEnd() {
    return this.end;
  }

  public void setBegin(Point begin) {
    super.setXY(begin.getX(), begin.getY());
  }

  public void setEnd(Point end) {
    super.setXY(end.getX(), end.getY());
  }

  public int getBeginX() {
    return super.getX();
  }

  public int getBeginY() {
    return super.getY();
  }

  public int getEndX() {
    return end.getX();
  }

  public int getEndY() {
    return end.getY();
  }

  public void setBeginX(int x) {
    super.setX(x);
  }

  public void setBeginY(int y) {
    super.setY(y);
  }

  public void setEndX(int x) {
    end.setX(x);
  }

  public void setEndY(int y) {
    end.setY(y);
  }

  public void setBeginXY(int x, int y) {
    super.setXY(x, y);
  }

  public void setEndXY(int x, int y) {
    this.end.setXY(x, y);
  }

  public double getLength() {
    int xDiff = getEndX() - getBeginX();
    int yDiff = getEndY() - getBeginY();
    return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
  }

  public double getGradient() {
    int xDiff = getEndX() - getBeginX();
    int yDiff = getEndY() - getBeginY();
    return Math.atan2(yDiff, xDiff);
  }

  @Override
  public String toString() {
    return "Line[begin=" + super.toString() + " ,end=" + this.end + ']';
  }
}
