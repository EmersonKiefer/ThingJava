/**
 * Created by student on 5/30/18.
 */
public class Soldier extends Sprite {

    private int health, damage;

    public Soldier(int x, int y, int health, int damage){
        super(x, y, EAST);
        setPic("SniperRifle.png", EAST);
        setSpeed(5);
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
