import java.awt.*;

/**
 * Created by student on 6/14/18.
 */
public class WireEnemy extends Enemy{
    int row;
    private boolean isDead = false;



    public WireEnemy(int row){
        super(row, 200, 1);
        setPic("barbedWire.png", WEST);
        setLoc(new Point(1020,(int)(getLoc().getY())));
        this.row = row;
        setSpeed(0);
    }

}


