/**
 * Created by student on 6/6/18.
 */
public class BazookaMan extends Soldier {
    int x, y;
    private boolean isDead = false;
    int health = 5, damage = 100;



    public BazookaMan(int x, int y){
        super(x, y, 5, 100);
        this.x = x;
        this.y = y;
        setSpeed(15);
    }
}
