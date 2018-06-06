/**
 * Created by student on 6/6/18.
 */
public class PistolSoldier extends Soldier{
    int x, y;
    private boolean isDead = false;



    public PistolSoldier(int x, int y, int health, int damage){
        super(x, y, 15, 110);
        this.x = x;
        this.y = y;
        setSpeed(12);
    }
}
