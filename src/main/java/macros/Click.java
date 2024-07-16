package main.java.macros;


public class Click{

    private int[] loc;

    public Click(int x,int y) 
        {
        loc = new int[2];
        loc[0] = x;
        loc[1] = y;
        }

    public int[] getLoc(){
        return this.loc;
    } 
}