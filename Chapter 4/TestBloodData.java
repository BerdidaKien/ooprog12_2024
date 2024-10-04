import java.util.Scanner;

public class TestBloodData {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        BloodData patient1 = new BloodData();

        System.out.print("Enter Blood type: ");
        String bloodType = scanner.nextLine();

        System.out.print("Enter Rh Factor: ");
        String rhFactor = scanner.nextLine();

        patient1.setBloodType(bloodType);
        patient1.setRhFactor(rhFactor);
        patient1.displayBloodInfo();
        scanner.close();
    }
}
