/**
 * Created by s1230158 on 2017/05/21.
 */
public class Airplane extends Moveable {

    public Airplane() {
        super("fly");
    }

    public void move(){
        System.out.println("[Airplane] " + getname() + " fly !! "/* + getrun()*/);
    }

    //public void mover(){        System.out.println(getrun());    }

}
