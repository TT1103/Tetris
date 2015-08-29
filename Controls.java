import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * This world class is used to display the controls to the user.
 * 
 * @author Tiger Zhao
 * @version January 5, 2015
 */
public class Controls extends World
{
    private Button backButton;
    
    /**
     * Constructor for objects of class Controls.
     */
    public Controls(){    
        super(600, 700, 1); 
        showControls();
        backButton = new Button("backButton",new GreenfootImage("backButton.png"));
        addObject(backButton, 300,600);
    }
    
    /**
     * act method for the class Controls
     * This method is continuously run.
     */
    public void act(){
        if(backButton.isPressed()){
            Greenfoot.setWorld(new Menu());
        }
    }
    
    /**
     * Displays the controls in text on the screen.
     */
    public void showControls(){
        int size =28;//the font size to be used
        
        //display the text
        addObject(new Text("Welcome to Tetris, the objective of this game is to clear lines.",size),300,50);
        addObject(new Text("Use the left and right arrow keys to move the block left/right.",size),300,100);
        addObject(new Text("Use the down arrow key to quickly slide the block down.",size),300,150);
        addObject(new Text("Use the space bar to instantly drop the block down.",size),300,200);
        addObject(new Text("Use either the shift key or c to store/take out blocks.",size),300,250);
        addObject(new Text("Use the up arrow key rotate the block clockwise.",size),300,300);
        addObject(new Text("Use z to rotate the block counter clockwise.",size),300,350);
        addObject(new Text("Press p to pause/unpause the game and access the menu.",size),300,400);
    }
}
