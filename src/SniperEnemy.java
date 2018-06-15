/**
 * Created by student on 6/14/18.
 */
public class SniperEnemy extends Enemy {


    public SniperEnemy(int row) {
        super(row, 120, 30);
        setPic("enemyRifleGuy.png", WEST);
        setSpeed(7);
    }
}

