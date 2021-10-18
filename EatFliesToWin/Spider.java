// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Spider extends Actor
{
    private GreenfootImage spider1;
    private GreenfootImage spider2;
    private GreenfootImage spider3;
    private GreenfootImage spider4;
    private GreenfootImage spider5;
    private GreenfootImage spider6;

    /**
     * 
     */
    public Spider()
    {
        spider1 =  new GreenfootImage("spider1.png");
        spider2 =  new GreenfootImage("spider2.png");
        spider3 =  new GreenfootImage("spider3.png");
        spider4 =  new GreenfootImage("spider4.png");
        spider5 =  new GreenfootImage("spider5.png");
        spider6 =  new GreenfootImage("spider6.png");
    }

    /**
     * Act - do whatever the Spider wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    final public void act()
    {
        if (Greenfoot.isKeyDown("w")) {
            move(4);
        }
        if (Greenfoot.isKeyDown("s")) {
            move(-3);
        }
        if (Greenfoot.isKeyDown("a")) {
            turn(-7);
        }
        if (Greenfoot.isKeyDown("d")) {
            turn(7);
        }
        lookForFly();
        switchimage();
    }

    /**
     * 
     */
    public void switchimage()
    {
        if (getImage() == spider1) {
            setImage(spider2);
        }
        else {
            if (getImage() == spider3) {
                setImage(spider4);
            }
            else {
                if (getImage() == spider5) {
                    setImage(spider6);
                }
                else {
                    setImage(spider1);
                }
            }
        }
    }

    /**
     * 
     */
    public void lookForFly()
    {
        if (isTouching(Fly.class)) {
            removeTouching(Fly.class);
            Greenfoot.playSound("Crunch.mp3");
            World myWorld = getWorld();
            MyWorld space = (MyWorld)myWorld;
            Score counter = space.getCounter();
            counter.addScore();
            if (getWorld().getObjects(Fly.class).isEmpty()) {
                YouWin youwin =  new YouWin();
                myWorld.addObject(youwin, myWorld.getWidth() / 2, myWorld.getHeight() / 2);
                Greenfoot.stop();
            }
        }
    }
}
