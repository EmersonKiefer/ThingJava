/**
 * Created by student on 5/30/18.
 */
public class Soldier extends Sprite {

    public Soldier(int x, int y){
        super(x, y, EAST);
        setPic("Rifle.png", EAST);
        setSpeed(5);
    }
    public void update(){
        super.update();
    }


}
