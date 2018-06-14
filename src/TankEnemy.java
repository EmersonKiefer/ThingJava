import java.awt.*;

/**
 * Created by student on 6/6/18.
 */
public class TankEnemy extends Enemy {

    public TankEnemy(int row){

        super(row, 600, 35);
        setPic("enemyTankGuy.png", EAST);
        setLoc(new Point((int)(getLoc().getX()), (int)(getLoc().getY()+30)));
        setSpeed(4);
    }
}
