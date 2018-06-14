import java.awt.*;

/**
 * Created by student on 6/14/18.
 */
public class WireEnemy extends Enemy{
    int row;
    private boolean isDead = false;



    public WireEnemy(int row){
        super(row, 200, 1);
        setPic("barbedWire.png", EAST);
        setLoc(new Point(100,(int)(getLoc().getY())));
        this.row = row;
        setSpeed(0);
    }

}


