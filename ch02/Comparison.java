// Fig. 2.15: Comparison.java
// Compare integers using if statements, relational operators 
// and equality operators. 
import java.util.Scanner; // Program uses close Scanner. 

public class Comparison
{
    // main method 
    public static void main(String[] args)
    {
        /* Create Scanner variable input 
            and assigns it to new Scanner object(?) */
        Scanner input = new Scanner(System.in);

        // Declare int variables. 
        int number1; 
        int number2; 

        System.out.print("Enter first integer: "); 
        number1 = input.nextInt(); // Read first number. 
        // Scanner method nextInt obtains an integer. 

        System.out.print("Enter second integer: ");
        number2 = input.nextInt(); // Read second number. 

        if (number1 == number2)
            System.out.printf("%d == %d%n", number1, number2);
        
        if (number1 != number2)
            System.out.printf("%d != %d%n", number1, number2);
        
        if (number1 < number2)
            System.out.printf("%d < %d%n", number1, number2);

        if (number1 <= number2)
            System.out.printf("%d <= %d%n", number1, number2);

        if (number1 >= number2)
            System.out.printf("%d >= %d%n", number1, number2);
    } // End method main. 
} // End class Comparison. 
