public class FirstAddressExercise {

    public static void main(String[] args) {
        String company = "Google LLC";
        String address1 = "1600 Amphitheatre Parkway";
        String address2 = "Mountain View, CA 94043, USA";

        displayCompany(company);
        displayAddress1(address1);
        displayAddress2(address2);
        displaycomPany(company);
    }

    public static void displayCompany(String company) {
        System.out.println(company);
    }

    public static void displayAddress1(String address1) {
        System.out.println(address1);
    }

    public static void displayAddress2(String address2) {
        System.out.println(address2);
    }
    public static void displaycomPany(String company){
        System.out.println("Company: " + company);
    }
}
