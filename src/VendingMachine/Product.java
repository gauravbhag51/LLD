package VendingMachine;

public class Product {
   private final ProductType type;
   private int quantity;
   private final double cost;

   public Product(ProductType type, int quantity, int cost)
   {
       this.type = type;
       this.quantity = quantity;
       this.cost = cost;
   }

   public int getQuantity()
   {
       return quantity;
   }

   public ProductType getProductType()
   {
       return type;
   }

   public double getCost()
   {
       return cost;
   }

   public boolean isAvailable()
   {
       return quantity != 0;
   }

   public void dispense()
   {
       quantity--;
       System.out.println("Dispensed: "+type);
   }

   public void restock(int new_quantity)
   {
       quantity+=new_quantity;
   }

   public void displayAvailability()
   {
       System.out.println("Product type: "+ type + " Quantity: " + quantity);
   }
}
