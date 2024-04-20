package Assignment3.PKG1;

public class Human {


    public static void main(String[] args) {
        Animal A1 = new Animal();
        A1.name = "Rahul";
        A1.id = 1001;
     //   A1.age = 30;  Specifier is private so cant access in human class
        A1.Surname = "Choudhary";

        //Accessing Methods of Animal Class
        A1.eat();
        A1.walk();
        A1.getdetails();
        //as private specifier so gender method can not access in human class.


    }
}
