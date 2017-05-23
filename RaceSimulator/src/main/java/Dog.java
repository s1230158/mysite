/**
 * Created by s1230158 on 2017/05/21.
 */
public class Dog extends Moveable{

    public Dog(String name) {
        super(name);
    }

    public void move(){
        System.out.println("[Dog] " + getname() + " run !!");
    }

}
