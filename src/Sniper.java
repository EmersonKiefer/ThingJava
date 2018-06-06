/**
 * Created by student on 6/6/18.
 */
public class Sniper extends Soldier {
    int row;
    private boolean isDead = false;


    public Sniper(int row) {
        super(row, 30, 120);
        this.row = row;
        setSpeed(7);
    }
}
