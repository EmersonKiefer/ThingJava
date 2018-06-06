/**
 * Created by student on 6/6/18.
 */
public class BarbedWire extends Soldier {
    int x, y;
    private boolean isDead = false;
    int health = 5, damage = 100;



    public BarbedWire(int x, int y, int health, int damage){
        super(x, y, health, damage);
        this.x = x;
        this.y = y;
        setSpeed(0);
    }

}
