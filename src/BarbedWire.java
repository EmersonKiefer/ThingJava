import java.awt.*;

/**
 * Created by student on 6/6/18.
 */
public class BarbedWire extends Soldier {
    int row;
    private boolean isDead = false;



    public BarbedWire(int row){
        super(row, 200, 1, 150);
        setPic("barbedWire.png", EAST);
        setLoc(new Point(100,(int)(getLoc().getY())));
        this.row = row;
        setSpeed(0);
    }

}
