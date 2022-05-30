import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public int countJoryl = 0;
    Label jorylCount;

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        Hippo jeorje = new Hippo();
        addObject(jeorje,300,200);

        Croc byl = new Croc();
        addObject(byl,500,200);

        jorylCount = new Label(0,30);
        addObject(jorylCount,20,20);
    }

    
    
    public void decreaseJorylCount()
    {
        countJoryl--;
        jorylCount.setValue(countJoryl);
    }

    public void increaseJorylCount()
    {
        countJoryl++;
        jorylCount.setValue(countJoryl);
    }

    public void createJoryl()
    {
        RealJoryl juan = new RealJoryl();
        int x = Greenfoot.getRandomNumber(600);
        int y = Greenfoot.getRandomNumber(400);
        addObject(juan,x,y);   
    }
    
    public void endGame()
    {
        Label ended = new Label("La fin",300);
        if(countJoryl == 7)
        {
            addObject(ended,300,200);
        }
    }
}
