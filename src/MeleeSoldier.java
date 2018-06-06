/**
 * Created by student on 6/6/18.
 */
public class MeleeSoldier extends Soldier {
    int row;
    private boolean isDead = false;



    public MeleeSoldier(int row){
        super(row, 100, 5);
        setPic("meleeGuy.png", EAST);
        this.row = row;
        setSpeed(15);
    }

}
