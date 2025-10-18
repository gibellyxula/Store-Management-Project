public class MenuItems {

  /*
  * Creates the instance variables for the class "MenuItems" 
  * (can extend into the different subclasses)
  */
  
  private String flavor;
  private double price;
  private String itemName;
  private int numStock;

  /*
  * No argument constructor for the MenuItems class
  * Sets the default values
  */
  
  public MenuItems () {
    this ("Thai Tea", 5.99, "Boba Tea", 35);
  }

 /*
  * Parameterized Constructor for the MenuItems class
  * Passes the assigned values to an object's instance variable
  */
  
  public MenuItems (String flavor, double price, String itemName, int numStock) {
    this.flavor = flavor;
    this.price = price;
    this.itemName = itemName;
    this.numStock = numStock;
  }
  
 /*
  * This method returns the values of the instance variables
  * Also are the accessor methods of this class
  */

  public String getFlavor () {
    return flavor;
  }

  public double getPrice () {
    return price;
  }

  public String getItemName () {
    return itemName;
  }

  public int getNumStock () {
    return numStock;
  }

 /*
  * These methods are the mutator methods for the MenuItems class
  * These also change the value that is assigned to the instance variable
  */
  
  public void setFlavor (String newFlavor) {
    this.flavor = newFlavor;
  }

  public void setPrice (double newPrice) {
    if (newPrice < 0.0) {
      this.price = 0.0;
    }else if (newPrice >= 0) {
      this.price = newPrice;
    }
  }

  public void setItemName (String newItemName) {
    this.itemName = newItemName;
  }

  public void setNumStock (int newNumStock) {
    this.numStock = newNumStock;
  }

 /*
  * This method is the toString method
  * This changes the unreadable output to make it more readable
  */
  
  public String toString () {
    return "Flavor: " + flavor + "\nPrice: " + price + "\nItem Name: " + itemName + "\nHow Many Are in Stock: " + numStock;
  }
  
}
