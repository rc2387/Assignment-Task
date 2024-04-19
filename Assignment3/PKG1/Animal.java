package Assignment3.PKG1;

 public class Animal {

    //instance variable
    public String name;
    private int age;
    protected String Surname;
    int id;


        //Creating methods

        public void eat () {
            System.out.println("Animal can eat");
        }

        private void gender () {
            System.out.println("Animal have gender category");
        }

        protected void walk () {
            System.out.println("Animal can Walk");
        }
        void getdetails () {
            System.out.println("The details of Animal");
        }

        //Creating Constructor
        public Animal(){

       }
        public Animal(String Fname,int Rage,String LSurname,int Rid) {
            name = Fname;
            age = Rage;
            Surname = LSurname;
            id = Rid;
        }

}

