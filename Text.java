import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * The text class is used only for the purpose of displaying text to the user.
 * 
 * @author Tiger Zhao
 * @version January 15, 2015
 */
public class Text extends Actor
{
    /**
     * A constructor for the Text class
     * @param text the text to be displayed
     */
    public Text(String text){
        setImage(new GreenfootImage(text, 36, Color.WHITE,null));//display the text
    }
    
    /**
     * Another constructor for the Text class
     * @param text the text to be displayed
     * @param size the font size to be used
     */
    public Text(String text, int size){
        setImage(new GreenfootImage(text, size, Color.WHITE,null));//display the text
    }
}
