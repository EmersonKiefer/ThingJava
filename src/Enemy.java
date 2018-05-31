/**
 * Created by student on 5/31/18.
 */
public class Enemy extends Sprite {
    private int health, damage;
    public Enemy(int x, int y, int health, int damage){
        super(x, y, WEST);
        setPic("Rifle.png", WEST);
        setSpeed(0);
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
}
