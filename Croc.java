import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Croc here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Croc extends Actor
{
    public void act()
    {
        // Add your action code here.
        
        if(Greenfoot.isKeyDown("d")){
            move(2);
        }
        if(Greenfoot.isKeyDown("a")){
            move(-2);
        }
        getHappy();
    }
    
    public void getHappy()
    {
        boolean happy = false;
        if (isTouching(Hippo.class))
        {
            MyWorld world = (MyWorld) getWorld();
            world.createJoryl();
            
            world.increaseJorylCount();
        }
    }
}
