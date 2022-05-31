import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Avengers_Level_Threat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Avengers_Level_Threat extends Actor
{
    /**
     * Act - do whatever the Avengers_Level_Threat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        int x = getX();
        int y = getY()+5;
        setLocation(x,y);
        MyWorld world = (MyWorld) getWorld();
        
    }
}
