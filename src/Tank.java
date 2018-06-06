/**
 * Created by student on 6/6/18.
 */
public class Tank extends Soldier {
    int row;
    private boolean isDead = false;



    public Tank (int row){
        super(row, 600, 35);
        setSpeed(13);
        this.row = row;
    }
}
