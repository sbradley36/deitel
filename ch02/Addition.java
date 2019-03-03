// Fig. 2.7 Addition.java
// Addition program that inputs two numbers, then displays their sum. 
import java.util.Scanner; 

public class Addition
{
    public static void main(String[] args)
    {
        // Create a Scanner to obtain input. 
        Scanner input = new Scanner(System.in);
        // System.in is a standard input object. 

        int number1;
        int number2;
        int sum;

        System.out.print("Enter first integer: ");
        number1 = input.nextInt();  // Read first number. 

        System.out.print("Enter second integer: ");
        number2 = input.nextInt();  

        sum = number1 + number2; // assignment statement with binary operator

        System.out.printf("Sum is %d%n", sum);  // %d means decimal integer. 
    }
}