package Assignment1;

public class CubeSqrDemo {

    public static int square(int a, int b) {
        int s;
        s = a*a +b*b +2 * a * b;
        return s;

    }
    public int cube(int a,int b){
        int c;
        c= a*a*a + b*b*b + 3*a*a*b + 3*a*b*b;
        return c;
    }

    public static void main(String[] args) {
        int a, b;
        int find_square;
        find_square= square(2,3);
        System.out.println("The square of a and b is " +find_square);

        //Object Creation
        CubeSqrDemo cs =new CubeSqrDemo();
        System.out.println("The cube of a and b is " + cs.cube(2,3));

    }

}
