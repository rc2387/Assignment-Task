package Assignment3.PKG1;

public class Dog extends Animal{

    public static void main(String[] args) {

        //accessing the variable from Animal class
        Animal D1 = new Dog();
        D1.id = 2001;
        D1.name = "Amit";
        D1.Surname = "Singh";
      //  D1.age = 35;  due to Private specifier not accessable

        //accessing the Methods from Animal class

        D1.walk();
        D1.eat();
        D1.getdetails();
       // D1.gender(); due to Private specifier not accessable



    }

}
