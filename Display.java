import javax.swing.*;
import java.awt.*;

public class Display extends JFrame{
    public static void main(String[] args) {
        Display display = new Display();
        dis
    }
        
    public Display(){
        super("Shape Visualizer");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setBounds(100,100, 600, 400);
        this.setVisible(true);
        this.repaint();
    }

    }
    public void paint(Graphics g){
        super.paint(g);
        g.setColor(Color.GREEN);
        g.fillOval(25, 25, 100, 50);
    }
}