public class Main {
    public static void main(String[] args) {
      int countdown = 3;
  
      while (countdown > 0) {
        System.out.println(countdown);
        countdown--;
      }
      
      System.out.println("Happy New Year!!");
        int dice = 1;
    
        while (dice <= 6) {
          if (dice < 6) {
            System.out.println("No Yatzy.");
          } else {
            System.out.println("Yatzy!");
          }
          dice = dice + 1;
        }
        // Outer loop.
        for (int i = 1; i <= 2; i++) {
            System.out.println("Outer: " + i); // Executes 2 times
        // Inner loop
        for (int j = 1; j <= 3; j++) {
            System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
        }
      }
    }
  }  