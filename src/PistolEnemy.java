/**
 * Created by student on 6/14/18.
 */
public class PistolEnemy extends Enemy{

    public PistolEnemy(int row){
        super(row, 100, 5);
        setPic("enemyRevolverGuy.png", EAST);
        setSpeed(15);
    }

}
