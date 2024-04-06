package Assignment2;

public class Greatest {

// Function to find the biggest of three numbers
      static int find_greatest_number(int x, int y, int z) {

          if (x > y) {
              if (x > z) {
                  return x;
              } else  {
                  return z;
              }
          } else if(y>z){
              return y;
          } else {
              return z;
          }

        // return (y>x) ? (y>z)? y:z : (z>x) ? z:x ;
      }

          // Main function
    public static void main(String[] args)
    {

        // Declaring variables for 3 numbers
        int a, b, c;

        // Variable holding the largest number
        int largest;
        a = 1;
        b = 2;
        c = 3;
        // Calling the above function in main
        largest = find_greatest_number(a, b, c);

        // Printing the largest number
        System.out.println(largest + " is the largest number.");
    }
}