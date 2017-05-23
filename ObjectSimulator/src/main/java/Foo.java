/**
 * Created by s1230158 on 2017/05/21.
 */
import java.util.*;

public class Foo {

    private int x;
    //private int y;
    private Bar bar;

public Foo(int x, Bar bar ){

    this.x = x;
    this.bar = bar;

}

    public final int getX(){
        return x;
    }

    /*public final int getY(){
        return y;
    }*/

    public void setX(){
        this.x = x;
    }

    /*public final void setY(){
        this.y = y;
    }*/

    public final Bar getBar(){
        return bar;
    }

    public final int calc(){
        return x+bar.y;
    }

}
