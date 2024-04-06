package Assignment2;

public class Factorial {

    /*public static void main (String[] arg) {
        int fact = 1;
        for (int i = 1; i <= 10; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
    }*/
    static int nFactorial(int N){
        if (N==0)
            return 1;
        else
            return (N * nFactorial(N-1));
    }

    public static void main(String[] args) {
        int fact =1,num = 10;
        fact = nFactorial(num);
        System.out.println("Factorial of " +num+ " is " +fact);
    }
}
