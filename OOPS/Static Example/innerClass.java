public class innerClass {
    //outside classes can never be static only inner class can be static.

    //if i didn't have made this static,class Test would have been associated with object of innerClass and 
    // error would have come while creating object of Test without creating object of innerClass
    static class Test{
      String name;
      public Test(String name){
        this.name = name;
      } 
      // to print name when object is printed
      @Override
      public String toString(){
        return name;
      }
    }

    public static void main (String []args){
        //creating object of static inner class
       Test a = new Test("Dhruv");
       Test b = new Test("Nitin");

       System.out.println(a.name);
       System.out.println(b.name);

       //printing object will call toString method
       System.out.println(a);
    }
}
