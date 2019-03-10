// Convert String to int and double to String. 
// Conv.java
import java.lang.Integer;

public class Conv
{
    public int stringToInt(String input)
    {
        int output = Integer.parseInt(input);
        return output;
    }

    public String doubleToString(double input)
    {
        String output = String.format ("%.4f", input);
        return output;
    }
}