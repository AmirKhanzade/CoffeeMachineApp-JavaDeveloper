public class Espersso extends Coffee{
    // will inherit from the Coffee class. These subclasses define specific functionalities and details unique to each beverage type.
    // Add an int attribute named numberOfShots to store the number of servings for this espresso.
    int numberOfShots;
    // Create a parameterized constructor with four arguments, name, roast, price, and numberOfShots.
    public Espersso(String name,String roast,double price,int numberOfShots){
        //Use super to call the constructor of the Coffee class and set the name, roast, and price.
        super(name,roast,price);
        // Initialize numberOfShots using this.
        this.numberOfShots=numberOfShots;
    }
    //Define a new method named printEspressoDetails() inside the Espresso class. 
    public void printEspressoDetails(){
        // This method should print a message about the number of servings the user orders, the cost per serving, and their total bill.
        //You asked for 3 servings! Every serving of Espresso costs 2.5$. Your total bill is 7.5$
        
        System.out.println("each shots espersso costs 2.5 $ ");
        System.out.println("please enter number of your desired shots Espersso");

        System.out.println("your bill is : "+(numberOfShots*price)+" $ ");

    }
}
