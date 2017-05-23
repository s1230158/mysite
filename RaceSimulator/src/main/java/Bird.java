/**
 * Created by s1230158 on 2017/05/21.
 */
public class Bird extends Moveable{

    public Bird(String name) {
        super(name);
    }

    public void move(){
        System.out.println("[Bird] " + getname()  + " fly !!"/*getrun()*/);
    }

    //public void mover(){System.out.println(getrun());}

}
