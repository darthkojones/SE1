package mcifaculty;

public class LeafEmployee extends Employee {
    public LeafEmployee(String name, String position){
        super(name,position);
    }
    //dont forget to override the print method
    @Override
    public void printDetails(){
        System.out.println("Name " + name + ", position " + position );
    }

}
