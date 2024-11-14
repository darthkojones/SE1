package mcifaculty;

public class MCIDirectory {
    public static void main(String[] args) {
        
        Employee coolProf = new LeafEmployee("Andrea Corradini", "Super Cool Prof");
        Employee techGeek = new LeafEmployee("Tinsaeum Cerebrum ", "Mega Geek");
        Employee recruiter = new LeafEmployee("Handome Marc", "Handsome Recruiter");

        //now rhat we have the emplyees lets give them some departments

    Department admiDepartment = new Department("Administration");
    admiDepartment.addEmployee(recruiter);

    Department teachiDepartment = new Department("Knights of the Round Table");
    teachiDepartment.addEmployee(coolProf);

    Department geekSquad = new Department("Geek Squad");
    geekSquad.addEmployee(techGeek);

    //we need an organization to fit the departments in
    Department mci = new Department("MCI");
    mci.addEmployee(admiDepartment);
    mci.addEmployee(teachiDepartment);
    mci.addEmployee(geekSquad);

    //print out to check if it worked
    mci.printDetails();




    }

}
