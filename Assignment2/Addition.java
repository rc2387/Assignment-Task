package Assignment2;

public class Addition {
    //Invoking the add Method in Main Function
    public static void main(String[] args) {
        System.out.println("Addition of a and b is " +add(3,4));
    }

    //add Method Creation
    static int add(int a, int b){
     int c;
     c = a + b;
     return c;
    }
}
