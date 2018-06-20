import java.awt.*;

/**
 * Created by student on 6/6/18.
 */
public class TurretSoldier extends Soldier {

    public TurretSoldier(int row){

        super(row, 250, 25);
        setPic("machineGun.png", EAST);
        setLoc(new Point((int)(getLoc().getX()), (int)(getLoc().getY()+30)));
        setSpeed(0);
    }
}
