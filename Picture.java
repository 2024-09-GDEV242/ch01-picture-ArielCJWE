/**
 * This addignment is on an abstract pice that represents a world with
 * only water that is slowly being swallowed up by a black hole.
 * The astronaut and his wife that was sent on the mission to save the panet 
 * is caught in a dire situation where he might be stranded as his ship is 
 * going to be swallowed by the black hole!
 * 
 * @author  Ariel Wong-Edwin
 * @version 2024.09.09
 */
public class Picture
{
    private Circle blackhole;
    private Triangle spaceship;
    private Circle planet;
    private Person astronaut;
    private Square sun;
    private Person astronaut2;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        sun = new Square();
        blackhole = new Circle(); 
        spaceship = new Triangle();
        planet = new Circle ();
        astronaut = new Person();
        astronaut2 = new Person();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            planet.moveHorizontal(-140);
            planet.moveVertical(20);
            planet.changeSize(420);
            planet.makeVisible();
            
            blackhole.changeColor("black");
            blackhole.moveHorizontal(-70);
            blackhole.moveVertical(60);
            blackhole.changeSize(110);
            blackhole.makeVisible();
    
            spaceship.moveHorizontal(-70);
            spaceship.moveVertical(40);
            spaceship.makeVisible();
    
            astronaut.changeColor("yellow");
            astronaut.moveHorizontal(100);
            astronaut.moveVertical(-40);
            astronaut.makeVisible();
            
            astronaut2.changeColor("yellow");
            astronaut2.moveHorizontal(50);
            astronaut2.moveVertical(-40);
            astronaut2.makeVisible();
            
            sun.changeColor("red");
            sun.moveHorizontal(100);
            sun.moveVertical(-150);
            sun.makeVisible();
            
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        planet.changeColor("black");
        astronaut.changeColor("white");
        blackhole.changeColor("white");
        spaceship.changeColor("white");
        astronaut2.changeColor ("white");
        sun.changeColor ("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        planet.changeColor("blue");
        spaceship.changeColor("green");
        blackhole.changeColor("black");
        astronaut.changeColor("yellow");
        astronaut2.changeColor("yellow");

        sun.changeColor("red");
    }
}
