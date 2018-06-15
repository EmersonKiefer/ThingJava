/**
 * Created by student on 6/14/18.
 */
public class PistolEnemy extends Enemy{

    public PistolEnemy(int row){
        super(row, 110, 15);
        setPic("enemyRevolverGuy.png", WEST);
        setSpeed(15);
    }

}
