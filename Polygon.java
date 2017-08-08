public class Polygon extends Shape {
  MyIntArray xs;
  MyIntArray ys;
  public Polygon(int[] xs, int[] ys) {
    this.xs = new MyIntArray(xs);
    this.ys = new MyIntArray(ys);
  }
  public int left() {
    return xs.findLeast();
  }
  public int right() {
    return xs.findGreatest();
  }
  public int top() {
    return ys.findLeast();
  }
  public int bottom() {
    return ys.findGreatest();
  }
  public double getArea() {
    return (this.right() - this.left()) * (this.bottom() - this.top());
  }
  @Override
  public String toString() {
    String pairs = "points: ";
    for (int i = 0; i < xs.length(); i = i + 1) {
      pairs = pairs + "(" + xs.get(i) + ", " + ys.get(i) + ")";
    }
    return pairs;
  }
  public int[] getXCoords() {
    return xs.underlying;
  }
  public int[] getYCoords() {
    return ys.underlying;
  }
}
