/**
 * Created by student on 6/6/18.
 */
public class SniperSoldier extends Soldier {


    public SniperSoldier(int row) {
        super(row, 120, 30, 500);
        setPic("rifleGuy.png", EAST);
        setSpeed(7);
    }
}
