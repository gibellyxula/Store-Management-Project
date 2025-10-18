public class BubbleTea extends MenuItems {
  
  /*
  * Creates the instance variables for the class "BubbleTea" 
  * (also uses variables from the superclass)
  */
  
  private boolean isCaffeinated;
  private boolean isHot;

  /*
  * No argument constructor for the BubbleTea class
  * Sets the default values for the instance variables
  */
  
  public BubbleTea () {
    isCaffeinated = true;
    isHot = false;
  }
  
 /*
  * Parameterized Constructor for the BubbleTea class
  * Passes the assigned values to an object's instance variable
  * Uses the instance variables from MenuItems as well
  */
  
  public BubbleTea(String flavor, double price, String itemName, int numStock, boolean isCaffeinated, boolean isHot) {
    super (flavor, price, itemName, numStock);
    this.isCaffeinated = isCaffeinated;
    this.isHot = isHot;
}
  
 /*
  * This method returns the values of the instance variables isCaffeinated and isHot
  * The accessor methods for BubbleTea
  */
  
  public boolean isCaffeinated () {
    return isCaffeinated;
  }
  public boolean isHot () {
    return isHot;
  }
  
 /*
  * Mutator methods for the BubbleTea class
  * Changes the value that is assigned to the instance variables
  */
  
  public void setIsCaffeinated (boolean newIsCaffeinated) {
    this.isCaffeinated = newIsCaffeinated;
  }

  public void setIsHot (boolean newIsHot) {
    this.isHot = newIsHot;
  }
  
 /*
  * toString method for the BubbleTea class
  * Overrides the unreadable output to make it more readable for us
  */
  
  public String toString () {
    return super.toString() + "\nIs it Caffeinated? " + isCaffeinated + "\nIs it Hot? " + isHot;
  }
}