/**
 * Created by student on 6/6/18.
 */
public class PistolSoldier extends Soldier{
    int row;
    private boolean isDead = false;



    public PistolSoldier(int row){
        super(row, 110, 15);
        this.row = row;
        setSpeed(12);
    }
}
