public class MathTest {
    public static void main(String[] args) {
        double number = 50.0;
        double sqrtResult = Math.sqrt(50.0);  
        double sinResult = Math.sin(1.5);     
        double cosResult = Math.cos(1.5);     
        double floorResult = Math.floor(17.8); 
        double ceilResult = Math.ceil(17.2);  
        long roundResult = Math.round(17.5);  
        int maxResult = Math.max(45, 98);     
        int minResult = Math.min(45, 98);     
        double randomResult = 5 + (Math.random() * 10); 

        System.out.println("SQRT: " + sqrtResult);
        System.out.println("SIN: " + sinResult);
        System.out.println("COS: " + cosResult);
        System.out.println("FLOOR: " + floorResult);
        System.out.println("CEIL: " + ceilResult);
        System.out.println("ROUND: " + roundResult);
        System.out.println("MAX: " + maxResult);
        System.out.println("MIN: " + minResult);
        System.out.println("RANDOM: " + randomResult);
    }
}
