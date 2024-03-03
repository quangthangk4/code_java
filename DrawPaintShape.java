import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;

public class DrawPaintShape extends JPanel {
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        int y = getHeight();
        int x = getWidth();
        // paint hoa van
        for(int i = 1 ;i < 13 ;i++){
            g.drawLine(0, (y/12)*(i-1), (x/12)*i, y);
            g.drawLine(x, (y/12)*(i-1), (x/12)*(12-i), y);
            g.drawLine(0, (y/12)*(12-i+1), (x/12)*i, 0);
            g.drawLine(x, (y/12)*(12-i+1), (x/12)*(12-i), 0);
        }
        // paint Oval and Rectangle and Line
        g.drawRect(x/2-(180)/2, y/2-(180)/2, 180, 180);
        g.drawOval(x/2-(180)/2, y/2-(180)/2, 180, 180);
        g.drawLine(x/2-(180)/2, y/2-(180)/2, x/2+(180)/2, y/2+(180)/2);
    }
    public static void main(String[] args) {
        DrawPaintShape panel = new DrawPaintShape();
        JFrame application = new JFrame();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(500,500);
        application.setVisible(true);
    }
}
