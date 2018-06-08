/**
 * Created by student on 6/6/18.
 */
public class Tank extends Soldier {

    public Tank (int row){
        super(row, 600, 35);
        setPic("tankGuy.png", EAST);
        setSpeed(4);
    }
}
