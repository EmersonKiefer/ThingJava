/**
 * Created by student on 6/6/18.
 */
public class BazookaMan extends Soldier {
    int row;
    private boolean isDead = false;




    public BazookaMan(int row){
        super(row, 200, 50);
        setPic("bazooka1.png", EAST);
        this.row = row;
        setSpeed(3);
    }
}
