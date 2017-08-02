public class Circle extends Shape{
  int r;
  public Circle(int x, int  y, int r) {
    this.r = r;
    this.x = x;
    this.y = y;
  }
  public Circle() {
    this(0, 0, 1);
  }
  public void setRadius(int r) {
    this.r = r;
  }
  public int getRadius() {
    return this.r;
  }
  public void setX(int x) {
    this.x = x;
  }
  public int getX() {
    return this.x;
  }
  public void setY(int y) {
    this.y = y;
  }
  public int getY() {
    return this.y;
  }
  @Override
  public double getArea() {
    return this.r * this.r * Math.PI;
  }
  public boolean intersects(Circle main) {
    double distance = Math.sqrt(Math.pow(this.x - main.x, 2) + Math.pow(this.y - main.y, 2));
    double sum = this.r + main.r;
    return sum >= distance;
  }
  public String toString() {
    return "pos: " + this.x + ", " + this.y + ", radius: " + this.r;
  }
  @Override
  public int left() {
    int left = this.x - this.r;
    return left;
  }
  @Override
  public int right() {
    int right = this.x + this.r;
    return right;
  }
  @Override
  public int top() {
    int top = this.y - this.r;
    return top;
  }
  @Override
  public int bottom() {
    int bottom = this.y + this.r;
    return bottom;
  }
}
