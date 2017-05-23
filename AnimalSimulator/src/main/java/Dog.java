/**
 * Created by s1230158 on 2017/05/21.
 */
import java.util.ArrayList;
import java.util.List;

public class Dog extends Animal{

    private Dog dog;

    //ArrayList<Dog> array1 = new ArrayList<Dog>();

    public Dog(String name){
        super(name);
    }

    public String callName() {

        return("[Dog]Hey " + getName() + " !\nbowbow");
        //System.out.println("bowobw");

    }

    /*public Dog(Dog name){

        this.dog = name;
        array1.add(new Dog(dog));

    }*/

}
