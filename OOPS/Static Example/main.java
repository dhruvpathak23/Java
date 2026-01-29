
public class main {
    public static void main (String[] args){


        //creating human objects
        Human Dhruv = new Human(21, "Dhruv Pathak",90000, false);
        Human Nitin = new Human(26, "Nitin Pathak",80000, true);

        //print names
        System.out.println(Dhruv.name);
        

        //print all data of human objects
        System.out.println(Nitin);

        //print population
        System.out.println(Human.population); // correct way to access static variable
        System.out.println(Dhruv.population); // not recommended way but valid
       
        //we know that something which is not static,belongs to an  object
        //and something which is static,belongs to class

    }
}
