package OOPS.Singleton;

public class singleton {
    private singleton () {
        // private constructor to prevent instantiation
    }

    // static variable to hold the single instance of the class
    private static singleton instance;

    // static method to provide access to the single instance
    public static singleton getInstance() {
        
        // check whether 1 obj is created or not
        if(instance == null){

            // create the object if not created
            instance = new singleton();
        }
        return instance;
    }
    
        
}
