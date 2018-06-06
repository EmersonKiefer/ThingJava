/**
 * Created by student on 6/6/18.
 */
public class MeleeSoldier extends Soldier {
    int x, y;
    private boolean isDead = false;



    public MeleeSoldier(int x, int y, int health, int damage){
        super(x, y, 100, 5);
        setPic("meleeGuy.png", EAST);
        this.x = x;
        this.y = y;
        setSpeed(15);
    }

}
