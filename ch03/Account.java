// Fig. 3.1: Account.java
// Account class that contains a name instance variable 
// and methods to set and get its value. 

public class Account
{
    private String name; //instance variables
    private double balance;

    // Account constructor that receives two parameters
    public Account(String name, double balance) // constructor name is class name 
    {
        this.name = name; // assigns name to instance variable name

        // validate that the balnace is greater than 0.0; if not, 
        // instance variable balance keeps its default initial value of 0.0
        if (balance > 0.0)      // if balance is valid
        this.balance = balance; // assign it to instance variable balance
    }

    // method that deposits (adds) only a valid amount to the balance
    public void deposit(double depositAmount)
    {
        if (depositAmount > 0.0)           // if depositAmount is valid
        balance = balance + depositAmount; // add it to balance
    }

    // method returns account balance
    public double getBalance()
    {
        return balance;
    }

    // method that sets the name
    public void setName(String name)
    {
        this.name = name;       // store the name
    }

    // method that returns the name
    public String getName()
    {
        return name;           // return value of name to caller 
    }
} // end class Account 