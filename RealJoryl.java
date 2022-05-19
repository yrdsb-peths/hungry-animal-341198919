import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RealJoryl here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RealJoryl extends Actor
{
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("d")){
            move(3);
        }
        if(Greenfoot.isKeyDown("a")){
            move(-3);
        }
    }
}
