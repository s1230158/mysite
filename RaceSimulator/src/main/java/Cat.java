/**
 * Created by s1230158 on 2017/05/21.
 */
public class Cat extends Moveable{

    public Cat(String name) {
        super(name);
    }

    public void move(){
        System.out.println("[Cat] " + getname() + " run !!");
    }

}
