package at.mci.adrianpetre;

/**
 * represents a PhD student with attributes like thesis topic, supervisor name, and teaching support
 * @author darth
 */
class PhDStudent extends Student{
    private String thesisTopic;
    private String supervisorName;
    private boolean hasTeachingSupport;

    /*
     * Default constructor for PhDStudent
     */
    public PhDStudent(String name, int id, String thesisTopic, String supervisorName, boolean hasTeachingSupport) {
        super(name, id);
        this.thesisTopic = thesisTopic;
        this.supervisorName = supervisorName;
        this.hasTeachingSupport = hasTeachingSupport;
    }

    /*
     * getter for thesisTopic
     */
    public String getThesisTopic() {
        return thesisTopic;
    }
    /*
     * setter for thesisTopic
     */
    public void setThesisTopic(String thesisTopic) {
        this.thesisTopic = thesisTopic;
    }    
    /*
    * getter for supervisorName
    */

    public String getSupervisorName() {
        return supervisorName;
    }

    /*
     * setter for supervisorName
     */

    public void setSupervisorName(String supervisorName) {
        this.supervisorName = supervisorName;
    }
    
    /*
     * getter for hasTeachingSupport
     */
    public boolean isHasTeachingSupport() {
        return hasTeachingSupport;
    }

    /*
     * setter for hasTeachingSupport
     */
    public void setHasTeachingSupport(boolean hasTeachingSupport) {
        this.hasTeachingSupport = hasTeachingSupport;
    }

    /*
     * method to display the PhDStudent details
     */
    @Override
    public String toString() {
        return "\nPhDStudent"
                + "\nName: " + getName()
                + "\nStudent ID: " + getStudentId()
                + "\nThesis Topic: " + thesisTopic
                + "\nSupervisor Name: " + supervisorName
                + "\nTeaching Support: " + hasTeachingSupport;
    }
}
