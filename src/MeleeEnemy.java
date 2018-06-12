/**
 * Created by student on 6/12/18.
 */
public class MeleeEnemy extends Enemy {



public MeleeEnemy(int row){
        super(row, 100, 5);
        setPic("meleeGuy.png", EAST);
        setSpeed(15);
        }

}
