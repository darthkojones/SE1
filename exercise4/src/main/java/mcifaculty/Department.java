package mcifaculty;
import java.util.ArrayList;
import java.util.List;



public class Department extends Employee{
    private List<Employee> employees = new ArrayList<>();

    public Department(String name) {
        super(name, "Department");
       }

    public void addEmployee(Employee employee){
        employees.add(employee);

    }   

    public void removeEmployee(Employee employee){
        employees.remove(employee);
    }

    @Override
    public void printDetails(){
        System.out.println("Department " + name);
        for (Employee employee : employees){
            employee.printDetails();
        }
    }
}



