import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 *
 */
public class MyWorld extends World
{
    protected Score counter =  new  Score();

    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld()
    {
        super(600, 400, 1);
        prepare();
    }

    /**
     *
     */
    public Score getCounter()
    {
        return counter;
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        addObject(counter, 100, 40);
        Spider spider =  new  Spider();
        addObject(spider, 123, 198);
        Wasp wasp =  new  Wasp();
        addObject(wasp, 244, 107);
        Wasp wasp2 =  new  Wasp();
        addObject(wasp2, 393, 290);
        Wasp wasp3 =  new  Wasp();
        addObject(wasp3, 446, 118);
        Wasp wasp4 =  new  Wasp();
        addObject(wasp4, 222, 282);
        Score score =  new  Score();
        addObject(score, 71, 38);
        removeObject(score);
        removeObject(wasp4);
        Fly Fly =  new  Fly();
        randomFly(20);
    }

    /**
     *
     */
    public void populate()
    {
        addObject( new  Fly(), 2, 4);
        randomFly(20);
    }

    /**
     *
     */
    public void randomFly(int howMany)
    {
        int i = 0;
        while (i < howMany) {
            Fly Fly =  new  Fly();
            int x = Greenfoot.getRandomNumber(getWidth());
            int y = Greenfoot.getRandomNumber(getHeight());
            addObject(Fly, x, y);
            i = i + 1;
        }
    }
}
