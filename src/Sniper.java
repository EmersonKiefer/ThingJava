/**
 * Created by student on 6/6/18.
 */
public class Sniper extends Soldier {
    int x, y;
    private boolean isDead = false;


    public Sniper(int x, int y, int health, int damage) {
        super(x, y, 30, 120);
        this.x = x;
        this.y = y;
        setSpeed(7);
    }
}
