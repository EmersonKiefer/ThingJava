/**
 * Created by student on 5/31/18.
 */
public class Enemy extends Sprite {

    private int health, damage;
    private boolean isDead = false;

    public Enemy(int row, int health, int damage){
        super(1100, 100*row + 65, WEST);
        setPic("enemyGuy.png", WEST);
        setSpeed(10);
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
    public int getDamage() {
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
