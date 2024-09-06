public class prelim {
   public static void main(String[] args){
      
      int n1 = 0;
      int n2 = 1;
      int cnt = 0;
      
      System.out.println("Fibonacci starts at " + n1);
      for(int i = 1; i <= 9; i++){
         int nExt = n1 + n2;
         n1 = n2;
         n2 = nExt;
         System.out.println("next would be: " + n1);
      }
   }
}