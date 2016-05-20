import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class COUNTER here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class COUNTER extends Actor
{
    private int score;
    
    public COUNTER()
    {
     score = 0;
     setImage (new GreenfootImage(200,30)); 
     update();
    }
    
    public void addScore() 
        {
     score++;
     update();
    }
    public void update ()
    {
        GreenfootImage img = getImage();
        img.clear();
        img.setColor(Color.WHITE);
        img.drawString("Score:" + score, 4, 20);
    }
    

   

}    
    
          
    

