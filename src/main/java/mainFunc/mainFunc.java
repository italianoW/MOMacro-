package main.java.mainFunc;



public class mainFunc {
    public static void main(String args[])
    {
        coordsCollector collector = new coordsCollector();
        System.out.println(collector.getX());
        System.out.println(collector.getY());

        new GUI();
    }

}
