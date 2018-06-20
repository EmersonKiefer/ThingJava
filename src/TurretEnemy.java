import java.awt.*;

/**
 * Created by student on 6/6/18.
 */
public class TurretEnemy extends Enemy {

    public TurretEnemy(int row){

        super(row, 250, 25);
        setPic("machineGunEnemy.png", WEST);
        setLoc(new Point((int)(getLoc().getX()), (int)(getLoc().getY()+30)));
        setSpeed(0);
    }
}
