public class Rectangle extends Shape{
  int h;
  int w;
  public Rectangle(int x, int y, int w, int h) {
    this.x = x;
    this.y = y;
    this.w = w;
    this.h = h;
  }
  @Override
  public double getArea() {
    return this.h * this.w;
  }
  @Override
  public Rectangle getBoundingRectangle() {
    return this;
  }
  public String toString() {
    return "pos: " + this.x + ", " + this.y + ", width: " + this.w + ", height: " + this.h;
  }
  @Override
  public int left() {
    int left = this.x;
    return left;
  }
  @Override
  public int right() {
    int right = this.x + (this.w);
    return right;
  }
  @Override
  public int top() {
    int top = this.y;
    return top;
  }
  @Override
  public int bottom() {
    int bottom = this.y + (this.h);
    return bottom;
  }
}
