// Fig. 3.2: AccountTest.java
// Creating tand manipulating an Account object. 
import java.util.Scanner; 

public class AccountTest1
{
    public static void main(String[] args)
    {
        // Create a Scanner object to obtain input. 
        Scanner input = new Scanner(System.in);

        // Create an Account object and assign it to myAccount. 
        Account1 myAccount = new Account1();

        // Display initial value of name (null). 
        System.out.printf("Initial name is: %s%n%n", myAccount.getName());

        // Prompt for and read name. 
        System.out.println("Please enter the name:");
        String theName = input.nextLine(); // Read a line of the text. 
        myAccount.setName(theName); // Put theName in myAccount. 
        //System.out.println(); 

        // Display the name stored in the object myAccount. 
        System.out.printf("Name in object myAccount is :%n%s%n", 
            myAccount.getName());

        input.close();
    }
}