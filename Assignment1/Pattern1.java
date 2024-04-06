package Assignment1;

public class Pattern1 {
    /*public static void main(String[] arg) {
        for (int i = 6; i > 3; i--) {
            for (int j = 0; j <i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }*/
  public static void printpattern1(int n) {
      int i, j;
      for (i = n; i > 3; i--) {
          for (j = 0; j < i - 1; j++) {
              System.out.print("*");
          }
          System.out.println();
      }
  }
    public static void main(String[] arg) {
        int n = 6;
          printpattern1(n);

        }
    }