package Assignment3.PKG2;

import Assignment3.PKG1.Animal;

public class Food {

    public static void main(String[] args) {

        Animal A5 = new Animal();
        //Accessing variable from PKG1 Animal class
        A5.name ="Ganesh";
        // A5.id = 6001;     id variable is not public in pkg 1 Animal class so can not access.
        // A5.age = 50;      age variable is having  Private in pkg 1 Animal class so can not access.
        // A5.Surname = "Singh"; Surname variable is having protected in pkg 1 Animal class so can not access.

        //Accessing methods from PKG1 Animal class

         A5.eat();
        //A5.gender();   gender has private access in PKG1 in Animal class can not access.
        //A5.walk();     walk has protected access in PKG1 in Animal class can not access.
        //A5.getdetails(); getdetails has not public access in PKG1 in Animal class can not access.

    }
}
