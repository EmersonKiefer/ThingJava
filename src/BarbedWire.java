/**
 * Created by student on 6/6/18.
 */
public class BarbedWire extends Soldier {
    int x, y;
    private boolean isDead = false;



    public BarbedWire(int x, int y){
        super(x, y, 5, 100);
        this.x = x;
        this.y = y;
        setSpeed(0);
    }




}
