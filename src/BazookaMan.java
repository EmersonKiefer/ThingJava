/**
 * Created by student on 6/6/18.
 */
public class BazookaMan extends Soldier {
    int x, y;
    private boolean isDead = false;



    public BazookaMan(int x, int y, int health, int damage){
        super(x, y, 5, 100);
        this.x = x;
        this.y = y;
        setSpeed(15);
    }
}