public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    // static variable to keep track of population
    static long population;

    public Human(int age, String name, int salary, boolean married){
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population++; // increment population whenever a new human object is created
    }
    // to get all the data of human object
    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", married=" + married +
                '}';
    }
}
