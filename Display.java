import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Display extends JFrame{
    ArrayList<Shape> shapes;
    public static void main(String[] args) {
        Display display = new Display();
    }
        
    public Display(){
        super("Shape Visualizer");
        shapes = new ArrayList<Shape>();
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setBounds(100,100, 700, 500);
        this.setVisible(true);
        this.repaint();
    }

    public void paint(Graphics g){
        for(Shape s : shapes){
            if(s instanceof Circle){
                g.setColor(new Color(255, 0, 0, 150));
                g.fillOval(s.left(), s.top(), s.right()-s.left(), s.bottom()-s.top());
            }else if(s instanceof Rectangle){
                g.setColor(new Color(0, 255, 0, 150));
                g.fillRect(s.left(), s.top(), s.right()-s.left(), s.bottom()-s.top());
            }else if(s instanceof Polygon){
                g.setColor(new Color(150, 0, 150, 150));
                g.fillPolygon(((Polygon)s).getXCoords(), ((Polygon)s).getYCoords(), ((Polygon)s).getXCoords().length);
            }
        }
    }

    public void addShape(Shape a){
        shapes.add(a);
    }
}