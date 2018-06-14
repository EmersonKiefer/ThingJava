/**
 * Created by student on 6/6/18.
 */
public class BazookaSoldier extends Soldier {


    public BazookaSoldier(int row){
        super(row, 200, 50, 1000, 3);
        setPic("bazookaGuy.png", EAST);
        setSpeed(5);
    }
}
