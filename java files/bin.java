import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
class DrawSmiley extends JPanel
{
   public void paintComponent(Graphics g)
   {
      super.paintComponent(g);
      g.drawRect(80, 70, 150, 150);
      g.drawRect(70,120,10,50);
      g.drawRect(230,120,10,50);
      // Ovals for eyes
      // with black color filled
      g.setColor(Color.BLACK);
      g.fillRect(120, 120, 15, 15);
      g.fillRect(170, 120, 15, 15);
      // Arc for the smile
      g.drawArc(130, 180, 50, 20, 180, 180);
   } 
   public static void main(String[] args)
   {
      DrawSmiley panel = new DrawSmiley();      
      JFrame application = new JFrame();
      application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      application.add(panel);
      application.setSize(230, 250);      
      application.setVisible(true);
   }
}
