import java.awt.*;

/**
 * Created by student on 6/6/18.
 */
public class WireSoldier extends Soldier {
    int row;
    private boolean isDead = false;



    public WireSoldier(int row){
        super(row, 200, 1, 150, 0);
        setPic("barbedWire.png", EAST);
        setLoc(new Point(100,(int)(getLoc().getY())));
        this.row = row;
        setSpeed(0);
    }

}
