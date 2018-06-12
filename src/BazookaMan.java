/**
 * Created by student on 6/6/18.
 */
public class BazookaMan extends Soldier {


    public BazookaMan(int row){
        super(row, 200, 50, 1000);
        setPic("bazookaGuy.png", EAST);
        setSpeed(5);
    }
}
