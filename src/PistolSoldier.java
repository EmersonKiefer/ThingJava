/**
 * Created by student on 6/6/18.
 */
public class PistolSoldier extends Soldier{



    public PistolSoldier(int row){
        super(row, 110, 15);
        setPic("revolverGuy.png", EAST);
        setSpeed(12);
    }
}
