public class Billing {
   
   public void computeBill(double price) {
      double total = price + (price * 0.08);
      System.out.println("The total price for each bill is: $" + total);
   }
   
   public void computeBill(double price, int quantity){
      double total = (price * quantity) + ((price * quantity) * 0.08);
      System.out.println("The total price for the bill is : $" + total);
   }
   
   public void computeBill(double price, int quantity, int coupon){
      double discount = (price * quantity) - coupon;
      double total = discount + (discount * 0.08);
      System.out.println("The total price for the bill is: $" + total);
   }
   
   public static void main(String[] args){
      
      Billing bill = new Billing();
      
      bill.computeBill(23.2);
      bill.computeBill(24.4, 2);
      bill.computeBill(25.3, 3, 5);
   }
}