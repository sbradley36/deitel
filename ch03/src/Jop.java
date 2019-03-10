// Input and output windows. 
// Jop.java
import javax.swing.JOptionPane;

public class Jop 
{
    String stringout;

    public String getit()
    {
       String stringin = JOptionPane.showInputDialog("Enter radius value.");
       return stringin;
    }

    public void showit(String stringout)
    {
       JOptionPane.showMessageDialog(null, "Diameter = " + stringout);
    }
}