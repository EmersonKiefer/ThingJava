import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
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
    private boolean startstop = true;
    private int soldierHealth = 0, enemyHealth = 0;
    private int soldierDamage = 0, enemyDamage = 0;
    private int soldierCount = 0, enemyCount = 0;


    //gun icon on bottom
    Sprite test = new Soldier(5, 725, 100, 100);


    //5 rows of soldiers
    Soldier s1 = new Soldier(0, 150, 500, 50);
    Soldier s2 = new Soldier(0, 250, 500, 50);
    Soldier s3 = new Soldier(0, 350, 500, 50);
    Soldier s4 = new Soldier(0, 450, 500, 50);
    Soldier s5 = new Soldier(0, 550, 500, 50);

    //enemies
    Enemy e1 = new Enemy(1100, 150, 500, 50);
    Enemy e2 = new Enemy(1100, 250, 500, 50);
    Enemy e3 = new Enemy(1100, 350, 500, 50);
    Enemy e4 = new Enemy(1100, 450, 500, 50);
    Enemy e5 = new Enemy(1100, 550, 500, 50);



    //TESTING

    public TrenchMain() {
        //adding 5 soldiers to their arraylist

        soldiers.add(s1);
        soldiers.add(s2);
        soldiers.add(s3);
        soldiers.add(s4);
        soldiers.add(s5);
        //adding enemies to their arraylist
        enemies.add(e1);
        enemies.add(e2);
        enemies.add(e3);
        enemies.add(e4);
        enemies.add(e5);

        //get sizes of soldier and enemy arraylist
        soldierCount = soldiers.size();
        enemyCount = enemies.size();



        //getting total damage of soldiers and enemies
        for (Soldier s : soldiers)
            soldierDamage += s.getDamage();
        for (Enemy e : enemies)
            enemyDamage += e.getDamage();


        timer = new Timer(850, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                for (Soldier s: soldiers)
                    s.update();
                battle();
                repaint();
            }
        });

        setupMouseListener();
    }


    public void setupMouseListener(){
        addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {
                if(e.getButton() == MouseEvent.BUTTON1) {
                    if(e.getY() >= 25 && e.getY()<=125 && e.getX()>= 1075 && e.getX()<=1175) {//start stop button
                        if(timer.isRunning()) {
                            startstop = true;
                            timer.stop();
                            repaint();

                        }
                        else {
                            startstop =false;
                            timer.start();
                            repaint();

                        }

                    }


                    if (e.getY() >= 670 && e.getY() <= 780) {
                        if (e.getX() >= 5 && e.getX() <= 110) {//knife

                            System.out.println("box1");
                        }
                        if (e.getX() >= 125 && e.getX() <= 235) {//revolver

                            System.out.println("box2");
                        }
                        if (e.getX() >= 245 && e.getX() <= 355) {//mine

                            System.out.println("box3");
                        }
                        if (e.getX() >= 365 && e.getX() <= 475) {//sniper

                            System.out.println("box4");
                        }
                        if (e.getX() >= 485 && e.getX() <= 595) {//machine gun

                            System.out.println("box5");
                        }
                        if (e.getX() >= 605 && e.getX() <= 715) {//bazooka

                            System.out.println("box6");
                        }
                        if (e.getX() >= 725 && e.getX() <= 835) {//tank

                            System.out.println("box7");
                        }
                        if (e.getX() >= 845 && e.getX() <= 955) {

                            System.out.println("box8");
                        }
                        if (e.getX() >= 965 && e.getX() <= 1075) {

                            System.out.println("box9");
                        }
                        if (e.getX() >= 1085 && e.getX() <= 1195) {

                            System.out.println("box10");
                        }
                    }
                }

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    }

    //Our paint method.
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        for (Soldier s: soldiers) {
            if (!s.isDead())
                s.draw(g2);
        }

        for (Enemy e: enemies) {
            if (!e.isDead())
                e.draw(g2);
        }

        g2.fillRect(0, 0, 1200, 150);
        g2.fillRect(0, 650, 1200, 150);

        //menu boxes
        g2.setColor(new Color(255,255, 255));
        for (int i = 5; i < 1100; i+=120) {
            g2.fillRect(i, 670, 110, 110);
        }
        //menu end

        //start stop button
        int[] xVals = {1085, 1165, 1085};
        int[] yVals = {35, 75, 115};
        if(startstop) {
            g2.setColor(new Color(255, 255, 255));
            g2.fillRect(1075, 25, 100, 100);
            g2.setColor(Color.green);
            g2.fillPolygon(xVals, yVals, 3);
            g2.setColor(Color.BLACK);
            g2.drawPolygon(xVals, yVals, 3);
        }
        else{
            g2.setColor(new Color(255, 255, 255));
            g2.fillRect(1075, 25, 100, 100);
            g2.setColor(Color.red);
            g2.fillRect(1085, 35, 80, 80);
            g2.setColor(Color.BLACK);
            g2.drawRect(1085, 35, 80, 80);
        }



        //start stop end




        //Draw Sprites at end
        test.draw(g2);


    }

    public void battle(){
        if (enemyCount > 0) {
            for (Soldier s : soldiers) {
                s.decreaseHealthBy(enemyDamage / enemyCount);
                if (s.getHealth() <= 0)
                    s.kill();
            }
        }
        if (soldierCount > 0){
            for (Enemy e : enemies){
                e.decreaseHealthBy(soldierDamage / soldierCount);
                if (e.getHealth() <= 0)
                    e.kill();
            }
        }
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




