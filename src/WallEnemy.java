import java.awt.*;

/**
 * Created by student on 6/6/18.
 */
public class WallEnemy extends Enemy {
    int row;
    private boolean isDead = false;



    public WallEnemy(int row){
        super(row, 500, 0);
        setPic("enemyWall.png", WEST);
        setLoc(new Point(1020,(int)(getLoc().getY())));
        this.row = row;
        setSpeed(0);
    }

}