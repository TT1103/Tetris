import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * This is the world class to represent the main menu.
 * The functions for the main menu are contained here.
 * 
 * @author Tiger Zhao
 * @version January 5, 2015
 */
public class Menu extends World
{
    private Button startButton;
    private Button controlsButton;
    
    /**
     * Constructor for objects of class Menu.
     */
    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 700, 1); 
        startButton = new Button("startButton",new GreenfootImage("startButton.png"));
        controlsButton = new Button("controlsButton",new GreenfootImage("controlsButton.png"));
        addObject(startButton, 300,300);
        addObject(controlsButton, 300,375);
    }
    
    /**
     * act method for the class Menu
     * This method is continuously run.
     */
    public void act(){
        if(startButton.isPressed()){ //if user presses the start button
            Greenfoot.setWorld(new Game()); //start the game
        }else if (controlsButton.isPressed()){ // if the user presses the controls button
            Greenfoot.setWorld(new Controls()); //show the controls
        }
    } 
}
