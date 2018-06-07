/**
 * Created by student on 6/6/18.
 */
public class Sniper extends Soldier {


    public Sniper(int row) {
        super(row, 120, 30);
        setPic("rifleGuy.png", EAST);
        setSpeed(7);
    }
}
