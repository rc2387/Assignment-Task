package Assignment1;

public class Pattern2 {
    public static void main(String[] arg){
        for(int i=0; i<4; i++){
            for(int j=0; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    /*public static void printpattern2(int n) {
        int i, j;
        for (i = n; i<4; i++) {
            for (j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] arg) {
        int n = 0;
        printpattern2(n);

    }*/
}
