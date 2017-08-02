public abstract class Shape {
  int x;
  int y;
  public abstract double getArea();
  public Rectangle getBoundingRectangle() {
    Rectangle bounding = new Rectangle(this.left(), this.top(), this.right() - this.left(), this.bottom() - this.top());
    return bounding; 
  }
  public abstract int left();
  public abstract int right();
  public abstract int top();
  public abstract int bottom();
/*  public overlap(Shape other) {
  	Rectangle first = this.getBoundingRectangle();
    Rectangle second = other.getBoundingRectangle();
    if (first.left <= second.left && first.right >= second.left && ) {
    	System.out.println("possible overlap");
    }
  }
  */
}
