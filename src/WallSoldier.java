import java.awt.*;

/**
 * Created by student on 6/6/18.
 */
public class WallSoldier extends Soldier {
    int row;
    private boolean isDead = false;



    public WallSoldier(int row){
        super(row, 500, 0, 400);
        setPic("wall.png", EAST);
        setLoc(new Point(80,(int)(getLoc().getY())));
        this.row = row;
        setSpeed(0);
    }

}