package Assignment1;

public class Switchdemo {
    public static void main(String[] arg) {

        int value = 6;
        switch (value) {

            case 0: {

                System.out.println("Did you attand the class?");
                break;
            }
            case 1: {
                System.out.println("Not Good");
                break;
            }
            case 2: {
                System.out.println("Need Improvement");
                break;
            }
            case 3: {
                System.out.println("Ok");
                break;
            }
            case 4: {
                System.out.println("Good");
                break;
            }
            case 5: {
                System.out.println("Very Good");
                break;
            }
            default :
            {
                System.out.println("Feedback is not valid");
                break;
            }
        }
    }
}
