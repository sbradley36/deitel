/* Addition3.java
   Modified Addition.java with windows. */
   
   // import statements
   import javax.swing.JOptionPane;
   import java.lang.Integer;

   public class Addition3
   {
       public static void main(String[] args)
       {
           JOptionPane grabber = new JOptionPane();

           int number1;
           int number2;
           int sum;

           String stringnum1 = grabber.showInputDialog("Enter integer");
           String stringnum2 = grabber.showInputDialog("Enter integer");

           number1 = Integer.parseInt(stringnum1);
           number2 = Integer.parseInt(stringnum2);
           sum = number1 + number2;

           JOptionPane.showMessageDialog(null, sum);
       }
   } // end class Addition2
   