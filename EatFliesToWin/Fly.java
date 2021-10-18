import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Fly extends Actor
{

    /**
     * 
     */
    public void act()
    {
        if (Greenfoot.getRandomNumber(100) > 90) {
            turn(Greenfoot.getRandomNumber(90) - 45);
        }
        if (isAtEdge()) {
            turn(15);
        }
        move(3);
    }
}
