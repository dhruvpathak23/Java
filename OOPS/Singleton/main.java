package OOPS.Singleton;

public class main {
    public static void main(String[]args){
        //creating singleton class objects
        singleton obj1 = singleton.getInstance();

        singleton obj2 = singleton.getInstance();

        singleton obj3 = singleton.getInstance();

        //all 3 ref. variables are pointing to just one object
    }
}
