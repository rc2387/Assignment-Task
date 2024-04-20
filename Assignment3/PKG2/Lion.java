package Assignment3.PKG2;

import Assignment3.PKG1.Animal;

public class Lion extends Animal {
    public Lion(String Fname, int Rage, String LSurname, int Rid) {
        super("Raj",35,"Jain",4001);

    }


    public static void main(String[] args) {

       /*Animal A3 = new Animal(); The constructor Animal is can not accesable as it is not Public
                                    if we want to access make it public in PKG1 as below */

        Animal A4 = new Animal();
        //Accessing Variable from PKG1 Animal Class

        A4.name = "Amit";
       // A4.id = 5001;     id variable is not public in pkg 1 Animal class so can not access.
       // A4.age = 20;      age variable is having  Private in pkg 1 Animal class so can not access.
       //  A4.Surname = "Singh"; Surname variable is having protected in pkg 1 Animal class so can not access.

        //Accessing  Methods from Pkg1 in Animal Class

        A4.eat();
        //A4.gender();   gender has private access in PKG1 in Animal class can not access.
        //A4.walk();     walk has protected access in PKG1 in Animal class can not access.
        //A4.getdetails(); getdetails has not public access in PKG1 in Animal class can not access.

    }
}


