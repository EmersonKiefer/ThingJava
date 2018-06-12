/**
 * Created by student on 5/30/18.
 */
public class Soldier extends Sprite {

    private int health, damage, cost, tier;
    private boolean isDead = false;


    public Soldier(int row, int health, int damage, int cost, int tier){
        super(0, 100*row + 65, EAST);
        setPic("SoldierGuy.png", EAST);
        setSpeed(15);
        this.health = health;
        this.damage = damage;
        this.cost = cost;
        this.tier = tier;
        cost = health*damage - tier*10;

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
    public int getCost(){
        return cost;
    }


}
