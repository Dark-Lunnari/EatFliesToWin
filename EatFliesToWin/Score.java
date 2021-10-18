import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Score extends Actor
{
    protected int score = 0;
    /**
     * Act - do whatever the Score wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage(new GreenfootImage("Score : " + score, 24, Color.GREEN, Color.BLACK));
    }
    
    public void addScore()
    {
        score++;
    }
}
