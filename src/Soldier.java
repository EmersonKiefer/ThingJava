/**
 * Created by student on 5/30/18.
 */
public class Soldier extends Sprite {

    private int health, damage;
    private boolean isDead = false;
    int row;


    public Soldier(int row, int health, int damage){
        super(0, 100*row + 50, EAST);
        setPic("SoldierGuy.png", EAST);
        setSpeed(15);
        this.row = row;
        this.health = health;
        this.damage = damage;

    }
    public void update(){
        super.update();
    }

    public void decreaseHealthBy(int amount){
        health = health - amount;
    }
    public void increaseHealthBy(int amount){
        health = health + amount;
    }
    public int getDamage(){
       return damage;
    }
    public int getHealth(){return health;}
    public void kill(){
        isDead = true;
    }
    public boolean isDead(){
        return isDead;
    }


}
