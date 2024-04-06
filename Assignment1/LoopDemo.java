package Assignment1;

public class LoopDemo {
    //for loop
   /* public static void main(String[] arg) {
        for (int i=2; i<=100; i++) {
            if (i%2==0){
                System.out.println(i);
            }
        }
    }*/
    //for loop without if
   /*public static void main(String[] arg) {
       for (int i=2; i<=100; i+=2) {
               System.out.println(i);
           }
   }*/
    public static void main(String[] arg) {
        int i =2;
        while (i<=100){
            System.out.println(i);
            i=i+2;
        }
    }
}

