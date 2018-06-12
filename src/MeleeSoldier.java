/**
 * Created by student on 6/6/18.
 */
public class MeleeSoldier extends Soldier {



    public MeleeSoldier(int row){
        super(row, 100, 5, 100, 0);
        setPic("meleeGuy.png", EAST);
        setSpeed(15);
    }

}
