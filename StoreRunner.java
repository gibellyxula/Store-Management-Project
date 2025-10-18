import java.util.Scanner;

public class StoreRunner {
  public static void main(String[] args) {
   
    MenuItems boba = new MenuItems("Strawberry", 5.99, "Boba Tea", 20);
    System.out.println("----------------------------------------");
    System.out.println(boba);

    BubbleTea thaiTea = new BubbleTea("Thai Tea", 5.00, "Boba Tea", 15, true, false);
    System.out.println("----------------------------------------");
    System.out.println(thaiTea);
    
    Cake iceCream = new Cake ("Chocolate", 15.00, "Chocolate Ice Cream Cake", 8, true, "Chocolate ganache");
    System.out.println("----------------------------------------");
    System.out.println(iceCream);
    
  }
}