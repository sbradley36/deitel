// Input and output windows. 
// Jop.java
import javax.swing.JOptionPane;

public class Jop 
{
    JOptionPane grab = new JOptionPane();
    JOptionPane show = new JOptionPane();

    private String stringin;
    private String stringout;

    public String getit()
    {
       stringin = grab.showInputDialog("Enter radius value.");
       return stringin;
    }

    public void showit(String stringout)
    {
       show.showMessageDialog(null, "Diameter = " + stringout);
    }
}