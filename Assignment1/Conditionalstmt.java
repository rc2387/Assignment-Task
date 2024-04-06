package Assignment1;

public class Conditionalstmt {
    public static void main(String[] arg)
    {

        int age = 40;
        String Gender = "Male";

        if (age >= 0 && age <= 18)
        {
            if (Gender == "Male")
            {
                System.out.println("User is :" + "BOY");
            }
            else if (Gender == "Female")
            {
                System.out.println("User is :" + "Girl");
            }
        }
        if (age >= 18 && age <= 60)
        {
            if (Gender == "Male")
            {
                System.out.println("User is :" + "Man");
            }
            else if (Gender == "Female")
            {
                System.out.println("User is :" + "Woman");
            }
        }
        if (age > 60)
        {
            if (Gender == "Male")
            {
                System.out.println("User is :" + "SeniorCitizen");
            }
            else if (Gender == "Female")
            {
                System.out.println("User is :" + "SeniorCitizen");
            }
        }


    }

    /*public static void main(String[] arg) {

        int age = 15;
        String Gender = "Male";


        if (age >= 0 && age <= 18 && Gender == "Male") {
            System.out.println("User is :" + "BOY");
        } else if (age >= 0 && age <= 18 && Gender == "Female") {
            System.out.println("User is :" + "Girl");
        } else if (age >= 18 && age <= 60 && Gender == "Male") {
            System.out.println("User is :" + "Man");
        } else if (age >= 18 && age <= 60 && Gender == "Female") {
            System.out.println("User is :" + "Woman");
        } else if (age >= 60 && Gender == "Male") {
            System.out.println("User is :" + "Senior Citizen");
        } else if (age >= 60 && Gender == "Female") {
            System.out.println("User is :" + "Senior Citizen");
        } else {
            System.out.println("Block is executed successfully");
        }

    }*/
}
