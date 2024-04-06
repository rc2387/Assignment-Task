package Assignment1;

public class Reptile {

    public static void main(String[] arg) {
        Reptile a = new Reptile();
        a.printinfo("snake", "red");
    }
         public void printinfo(String name, String color){
                 if (color == "red"){
                     System.out.println("Assignment1.Reptile "+name+" is very dangerous because color is "+color);
                 }

         }
}
