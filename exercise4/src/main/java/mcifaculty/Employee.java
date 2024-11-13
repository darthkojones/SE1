package mcifaculty;


public abstract class Employee {
    protected String name;
    protected String position;

    public Employee(String name, String position){
        this.name = name;
        this.position = position;
    }

    public abstract void printDetails();
}


