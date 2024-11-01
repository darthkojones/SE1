package at.mci.adrianpetre;
import java.util.List;

/**
 * represents a TA student with attributes like courses, role, name, and student ID
 * @author darth
 */
class TAStudent extends Student {
    private List<String> taCourse; //maybe TA can have multiple courses
    private String role; //TA can have different roles like tutor, lab assistant, grader etc

    /*
     * Default constructor for TAStudent
     */
    public TAStudent(String name, int id, List<String> taCourse, String role) {
        super(name, id);
        this.taCourse = taCourse; //we will assign with a setter later
        this.role = role;         //same here 

    }

    /*
     * getter for taCourse
     */
    public List<String> getTaCourse() {
        return taCourse;
    }

    /*
     * setter for taCourse
     */
    public void setTaCourse(List<String> taCourse) {
        this.taCourse = taCourse;
    }

    /*
     * getter for role
     */
    public String getRole() {
        return role;
    }

    /*
     * setter for role
     */
    public void setRole(String role) {
        this.role = role;
    }

    /*
     * method to display the TAStudent details
     */
    @Override
    public String toString() {
        return "\nTAStudent"
                + "\nName: " + getName()
                + "\nStudent ID: " + getStudentId()
                + "\nTA Course: " + taCourse
                + "\nRole: " + role;
    }
    


    
}
