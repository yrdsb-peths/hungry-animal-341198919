import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hippo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hippo extends Actor
{
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("d")){
            move(5);
        }
        if(Greenfoot.isKeyDown("a")){
            move(-5);
        }
    }
}

