import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;

/**
 * Created by student on 5/29/18.
 */
public class TrenchMain extends JPanel {
    //instance fields for the general environment
    public static final int FRAMEWIDTH = 1200, FRAMEHEIGHT = 800;
    private Timer timer, timer2;
    private ArrayList<Soldier> soldiers = new ArrayList<Soldier>();
    private boolean startstop = true;
    private int soldierHealth = 0, enemyHealth = 0;
    private int soldierDamage = 0, enemyDamage = 0, row = 1, level = 1, money = 0;
    private int soldierCount = 0, enemyCount = 0;
    private BufferedImage knifePic, wirePic, bazookaPic, machineGunPic, revolverPic, riflePic, wallPic, tankPic, backgroundPic, minePic;
    private ArrayList<Enemy> enemies = new ArrayList<Enemy>();
    private ArrayList<Enemy> lvl1 = new ArrayList<Enemy>();
    private ArrayList<Enemy> lvl2 = new ArrayList<Enemy>();
    private ArrayList<Enemy> lvl3 = new ArrayList<Enemy>();
    private ArrayList<Enemy> lvl4 = new ArrayList<Enemy>();
    private ArrayList<Enemy> lvl5 = new ArrayList<Enemy>();



    public TrenchMain() {
        for (int i = 1; i <= 5; i++) {
            lvl1.add(new MeleeEnemy(i));
        }
        for (int i = 1; i <= 5; i++) {
            lvl2.add(new PistolEnemy(i));
            lvl3.add(new TankEnemy(i));
        }

        if (level == 1){
            enemies = lvl1;
        }
        if (level == 2){
            enemies = lvl2;
        }
        if (level == 3){
            enemies = lvl3;
        }
        if (level == 4){
            enemies = lvl4;
        }
        if (level == 5){
            enemies = lvl5;
        }
        try {
            knifePic = ImageIO.read(new File("res/" + "knife.png"));
            wirePic = ImageIO.read(new File("res/" + "barbedWire.png"));
            bazookaPic = ImageIO.read(new File("res/" + "bazooka.png"));
            machineGunPic = ImageIO.read(new File("res/" + "machineGun.png"));
            revolverPic = ImageIO.read(new File("res/" + "revolver.png"));
            riflePic = ImageIO.read(new File("res/" + "sniperRifle.png"));
            wallPic = ImageIO.read(new File("res/" + "wall.png"));
            tankPic = ImageIO.read(new File("res/" + "tankGuy.png"));
            minePic = ImageIO.read(new File("res/" + "mine.png"));
            backgroundPic = ImageIO.read(new File("res/" + "background.png"));

        }catch(Exception e){
            e.printStackTrace();
        }


        timer = new Timer(850, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                soldierCount = soldiers.size();
                enemyCount = enemies.size();
                soldierDamage = 0;
                enemyDamage = 0;
                for (Soldier s : soldiers) {
                    if(!s.isDead())
                    soldierDamage += s.getDamage();
                }
                for (Enemy e : enemies) {
                    if(!e.isDead())
                    enemyDamage += e.getDamage();
                }
                for (Soldier s: soldiers) {
                    if(!s.isDead())
                    s.update();
                }
                for (Enemy e : enemies) {
                    if(!e.isDead())
                    e.update();
                }
                battle();
                if (enemyCount == 0)
                    if(level == 1) {
                        enemies = lvl2;
                        level++;
                    }
                    else if(level == 2) {
                        enemies = lvl3;
//                        level++;
                    }

                if (soldierCount == 0 && money < 100) {
                    enemies = lvl1;
                    level = 0;
                }
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
                    if(row >5)
                        row=1;


                    if (e.getY() >= 670 && e.getY() <= 780) {
                        if (e.getX() >= 5 && e.getX() <= 110) {//melee
                            soldiers.add(new MeleeSoldier(row));
                            row++;
                            repaint();

                            System.out.println("box1");
                        }
                        if (e.getX() >= 125 && e.getX() <= 235) {//pistol
                            soldiers.add(new PistolSoldier(row));
                            row ++;
                            repaint();
                            System.out.println("box2");
                        }
                        if (e.getX() >= 245 && e.getX() <= 355) {//sniper
                            soldiers.add(new SniperSoldier(row));
                            row ++;
                            repaint();
                            System.out.println("box3");
                        }
                        if (e.getX() >= 365 && e.getX() <= 475) {//bazooka
                            soldiers.add(new BazookaSoldier(row));
                            row ++;
                            repaint();
                            System.out.println("box4");
                        }
                        if (e.getX() >= 485 && e.getX() <= 595) {//tank
                            soldiers.add(new TankSoldier(row));
                            row ++;
                            repaint();
                            System.out.println("box5");
                        }
                        if (e.getX() >= 605 && e.getX() <= 715) {//barbed wire
                            soldiers.add(new WireSoldier(row));
                            row ++;
                            repaint();
                            System.out.println("box6");
                        }
                        if (e.getX() >= 725 && e.getX() <= 835) {//wall
                            soldiers.add(new WallSoldier(row));
                            row ++;
                            repaint();

                            System.out.println("box7");
                        }
                        if (e.getX() >= 845 && e.getX() <= 955) {//turret
                            soldiers.add(new TurretSoldier(row));
                            row ++;
                            repaint();

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
        if(backgroundPic != null)
            g2.drawImage(backgroundPic, 0, -40, null);
        g2.setColor(Color.white);
        g2.drawString("Your money: $" + money, 2, 15);
        g2.drawString("Level: "+ level, 200, 15);
        g2.setColor(Color.black);
        for (Soldier s: soldiers) {
            if (!s.isDead())
                s.draw(g2);
        }

        for (Enemy e: enemies) {
            if (!e.isDead())
                e.draw(g2);
        }

//        g2.fillRect(0, 0, 1200, 150);
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

        if(knifePic != null)
            g2.drawImage(knifePic, 5, 675, null);
        g2.setColor(Color.BLACK);
        g2.drawString("Damage: 5", 5, 740);
        g2.drawString("Health: 100", 5, 755);
        g2.drawString("Cost: 175", 5, 770);
        if(revolverPic != null)
            g2.drawImage(revolverPic, 125, 675, null);
        g2.drawString("Damage: 15", 125, 740);
        g2.drawString("Health: 110", 125, 755);
        g2.drawString("Cost: 285", 125, 770);
        if(riflePic != null)
            g2.drawImage(riflePic, 245, 680, null);
        g2.drawString("Damage: 30", 245, 740);
        g2.drawString("Health: 120", 245, 755);
        g2.drawString("Cost: 450", 245, 770);
        if(bazookaPic != null)
            g2.drawImage(bazookaPic, 365, 670, null);
        g2.drawString("Damage: 50", 365, 740);
        g2.drawString("Health: 200", 365, 755);
        g2.drawString("Cost: 750", 365, 770);
        if(tankPic != null)
            g2.drawImage(tankPic, 485, 680, null);
        g2.drawString("Damage: 35", 485, 740);
        g2.drawString("Health: 600", 485, 755);
        g2.drawString("Cost: 1100", 485, 770);
        if(wirePic != null)
            g2.drawImage(wirePic, 625, 675, null);
        g2.drawString("Damage: 1", 625, 740);
        g2.drawString("Health: 200", 625, 755);
        g2.drawString("Cost: 260", 625, 770);
        if(wallPic != null)
            g2.drawImage(wallPic, 745, 675, null);
        g2.drawString("Damage: 0", 725, 740);
        g2.drawString("Health: 500", 725, 755);
        g2.drawString("Cost: 625", 725, 770);
        if(machineGunPic != null)
            g2.drawImage(machineGunPic, 855, 670, null);
        g2.drawString("Damage: 5", 845, 740);
        g2.drawString("Health: 5", 845, 755);
        g2.drawString("Cost: 5", 845, 770);
        if(minePic != null)
            g2.drawImage(minePic, 975, 670, null);









        //start stop end



    }

    public void battle(){
        if (enemyCount > 0) {
            for (Soldier s : soldiers) {
                s.decreaseHealthBy(enemyDamage / enemyCount);
                if (s.getHealth() <= 0) {
                    s.kill();
//                    soldiers.remove(s);
                    soldierCount--;
                }
            }
        }
        if (soldierCount > 0){
            for (Enemy e : enemies){
                e.decreaseHealthBy(soldierDamage / soldierCount);
                if (e.getHealth() <= 0) {
                    e.kill();
//                    enemies.remove(e);
                    enemyCount--;
                }
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
        MakeSound makeSound = new MakeSound();
        makeSound.playSound("res/War and Peace Video Game Soundtrack - 09 Prussia Battle.wav");


    }
}




