// Exercise using covered material in Chapter 3. 
// BasicGeometry.java

public class BasicGeometry
{
    private static double pi = 3.14159;
    
    public static void main(String[] args)
    {
        Jop jop1 = new Jop();
        Conv conv1 = new Conv(); 

        String radius = jop1.getit();
        int radiusint = conv1.stringToInt(radius);
        double diameter = pi * radiusint;

        String diameterString = conv1.doubleToString(diameter);

        jop1.showit(diameterString);
    }
}
