public class Cake extends MenuItems {
  
  /*
  * Creates the instance variables for the class "Cake" 
  * (also uses the instance variables from the MenuItems superclass)
  */
  
  private boolean hasIceCream;
  private String frostingFlavor;

  /*
  * No argument constructor for the Cake class
  * Sets the default values for hasIceCream and frostingFlavor
  */
    public Cake () {
    hasIceCream = true;
    frostingFlavor = "buttercream";
  }
  
 /*
  * Parameterized Constructor for the Cake class
  * Assigns values to an object's instance variable
  * Uses the instance variables from the MenuItems superclass by using the keyword super
  */
  
    public Cake(String flavor, double price, String itemName, int numStock, boolean hasIceCream, String frostingFlavor) {
    super (flavor, price, itemName, numStock);
    this.hasIceCream = hasIceCream;
    this.frostingFlavor = frostingFlavor;
  }

 /*
  * Returns the values of the instance variables hasIceCream and frostingFlavor
  * Accessor methods of the Cake class
  */
  
  public boolean hasIceCream () {
    return hasIceCream;
  }
  public String frostingFlavor () {
    return frostingFlavor;
  }
  
 /*
  * Mutator methods for the Cake class
  * The value that is assigned to the instance variables hasIceCream and frostingFlavor change
  */
  
  public void setHasIceCream (boolean newHasIceCream) {
    this.hasIceCream = newHasIceCream;
  }

  public void setFrostingFlavor (String newFrostingFlavor) {
    this.frostingFlavor = newFrostingFlavor;
  }
  
 /*
  * This method is the toString method for the Cake class
  * Changes the unreadable text output in the console to make it into the phrase wanted
  */
  
  public String toString () {
    return super.toString() + "\nDoes the Cake Have Ice Cream? " + hasIceCream + "\nFrosting Flavor: " + frostingFlavor;
  }
}