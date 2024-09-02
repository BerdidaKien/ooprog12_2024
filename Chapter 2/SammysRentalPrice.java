import java.util.Scanner;

public class SammysRentalPrice {
    public static void main(String[] args) {

        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
        System.out.println("S        Sammy’s makes it fun in the sun.          S");
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");

        int costPHr = 40;
        int costPMin = 1;

        Scanner scanner = new Scanner(System.in);
      
        System.out.print("\nEnter the number of minutes the equipment was rented: ");
        int totalMin = scanner.nextInt();

        int hrs = totalMin / 60;
        int min = totalMin % 60;
        int totalPrice = (hrs * costPHr) + (min * costPMin);

        System.out.println("\n========= RENTAL DETAILS =========");
        System.out.println("Hours rented: " + hrs);
        System.out.println("Additional minutes: " + min);
        System.out.println("Total price: $" + totalPrice);
        System.out.println("==================================");
    }
}
