import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Wasp extends Actor
{

    /**
     * Act - do whatever the Wasp wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
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
        lookForSpider();
    }

    /**
     * 
     */
    public void lookForSpider()
    {
        if (isTouching(Spider.class)) {
            removeTouching(Spider.class);
            World myWorld = getWorld();
            YouLose youlose =  new  YouLose();
            myWorld.addObject(youlose, myWorld.getWidth() / 2, myWorld.getHeight() / 2);
            Greenfoot.stop();
        }
    }
}
