/**
   @Author: Nathan Baum
      Date: 10/31/2014
   Teacher: Boyko
  */
import kareltherobot.*;
import java.awt.Color;

// test comment
public class ClosingWindowDriver implements Directions
{
    public static void main(String args[])  {
        WindowCloser karel = new WindowCloser(7, 5, East, 9);  
        karel.run();
        karel.turnOff();  
    } 

    static {
        World.reset(); 
        World.readWorld("worlds/fig6-28.kwld"); 
        World.setBeeperColor(Color.black);
        World.setStreetColor(Color.gray);
        World.setNeutroniumColor(Color.black);
        World.setDelay(10);  
        World.setVisible(true);
    }
}
