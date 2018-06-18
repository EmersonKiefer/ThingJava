/**
 * Created by student on 6/18/18.
 */
public class BazookaEnemy extends Enemy {

    public BazookaEnemy(int row){
        super(row, 200, 50);
        setPic("enemyBazookaGuy.png", WEST);
        setSpeed(5);
    }
}
