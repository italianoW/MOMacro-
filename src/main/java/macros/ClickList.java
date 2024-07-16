package main.java.macros;
import java.util.LinkedList;
import java.util.NoSuchElementException;


public class ClickList {
    
    private LinkedList<Click> clicks;


    public ClickList(){
        clicks = new LinkedList<Click>();
    }

    public int addClick(int x, int y){
        if (x<0 || y<0){return -1;}
        Click c = new Click(x,y);
        clicks.add(c);
        return 1;
    }

    public int resetClicks()
    {
        try
            {
            int size = clicks.size();
            for (int i = 0; i<size; i++ ){clicks.removeLast();}
            return 1;
            }
        catch(NoSuchElementException exception)
            {
            return -1;
            }

    } 

}
