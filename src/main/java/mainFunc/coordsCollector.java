package main.java.mainFunc;
import java.awt.MouseInfo;

public class coordsCollector {
    
    public coordsCollector(){

    }

    public int getX()
    {
        if (MouseInfo.getPointerInfo().getLocation() == null)
            {
            return -2;
            }

        try
            {
            return MouseInfo.getPointerInfo().getLocation().x;
            }
        catch (SecurityException sec)
            {
            return -1;    
            } 
    }

    public int getY()
    {
        if (MouseInfo.getPointerInfo().getLocation() == null)
            {
            return -2;
            }

        try
            {
            return MouseInfo.getPointerInfo().getLocation().y;
            }
        catch (SecurityException sec)
            {
            return -1;    
            } 
    }

}
