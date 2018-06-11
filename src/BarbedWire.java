/**
 * Created by student on 6/6/18.
 */
public class BarbedWire extends Soldier {
    int row;
    private boolean isDead = false;



    public BarbedWire(int row){
        super(row, 500, 5);
        setPic("barbedWire.png", EAST);
//        setLoc(50, row*10);
        this.row = row;
        setSpeed(0);
    }

}
