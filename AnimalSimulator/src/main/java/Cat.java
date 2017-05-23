/**
 * Created by s1230158 on 2017/05/21.
 */
import java.util.ArrayList;
import java.util.List;

public class Cat extends Animal{

    private Cat cat;

//    ArrayList<Cat> array2 = new ArrayList<Cat>();



    public Cat(String name){

        super(name);
    }

    public String callName(){

        return("[Cat]Hey! " + getName() + " !\nmeou");

    }

}
