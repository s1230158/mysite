/**
 * Created by s1230158 on 2017/05/21.
 */
public class Car extends Moveable{

    public Car() {
        super("run");
    }

    public void move(){
        System.out.println("[Car] " + getname() + " run !! "  /*getrun()*/);
    }

    //public void mover(){        System.out.println(getrun());    }
}
