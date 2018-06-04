import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * Created by student on 5/29/18.
 */
public class TrenchMain extends JPanel {
    //instance fields for the general environment
    public static final int FRAMEWIDTH = 1200, FRAMEHEIGHT = 800;
    private Timer timer;
    private ArrayList<Soldier> soldiers = new ArrayList<Soldier>();
    private ArrayList<Enemy> enemies = new ArrayList<Enemy>();

    Sprite test = new Sprite(5, 670, Sprite.NORTH);
    Soldier s = new Soldier(0, 150, 100, 100);
    //TESTING

    public TrenchMain(){
        soldiers.add(s);
        timer = new Timer(40, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                s.update();
                repaint(); //always the last line.  after updating, refresh the graphics.
            }
        });
        timer.start();

        /*
        You probably don't need to modify this keyListener code.
         */

    }

    //Our paint method.
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        s.draw(g2);
        g2.fillRect(0, 0, 1200, 150);
        g2.fillRect(0, 650, 1200, 150);

        //menu boxes
        g2.setColor(new Color(255,255, 255));
        for (int i = 5; i < 1100; i+=120) {
            g2.fillRect(i, 670, 110, 110);
        }

        //menu end

        //Draw Sprites at end
        test.draw(g2);


    }

    //sets ups the panel and frame.  Probably not much to modify here.
    public static void main(String[] args) {
        JFrame window = new JFrame("Trench Warfare");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setBounds(0, 0, FRAMEWIDTH, FRAMEHEIGHT + 22); //(x, y, w, h) 22 due to title bar.

        TrenchMain panel = new TrenchMain();
        panel.setSize(FRAMEWIDTH, FRAMEHEIGHT);

        panel.setFocusable(true);
        panel.grabFocus();

        window.add(panel);
        window.setVisible(true);
        window.setResizable(false);
    }
}




