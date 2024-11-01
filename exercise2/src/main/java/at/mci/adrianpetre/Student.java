package at.mci.adrianpetre;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * represents a student with attributes like name, group, proficiency in java
 * @author darth
 */
public class Student {
    
    // static field to keep track of the number of Student objects created for exercise 7
    private static int studentCount = 0;
    private static int nextStudentID = 1;
    
    // data fields
    private String name;
    private String group;
    private int proficiencyInJava;
    private int studentID;
    private char gender;
    private ArrayList<Float> grades; // stores grades for all courses taken by a student for exercise 6
    
     /**
     * Default constructor aka initializes with default values
     */
    public Student(){
        this.name = "HE WHO SHALL NOT BE NAMED";
        this.group = "prolly in DiBSE23";
        this.proficiencyInJava = 0; //maybe 1?
        this.studentID = 0; //can this be null?
        this.gender = 'U'; // unknown but it's 2024, you can't assume gender anymore
        this.grades = new ArrayList<>();
        this.studentID = getNextStudentID();
        incrementStudentCount();
    }     
     
    /**
     * Constructor with all fields.
     * 
     * @param name the name of the student
     * @param group the group the student belongs to
     * @param proficiencyInJava the Java proficiency level of the student
     * @param studentID the student ID
     * @param gender the gender of the student
     */
    
     public Student(String name, String group, int proficiencyInJava, int studentID, char gender){
        this.name = name;
        this.group = group;
        this.proficiencyInJava = proficiencyInJava;
        this.studentID = studentID; 
        this.gender = gender; 
        this.grades = new ArrayList<>();
        this.studentID = getNextStudentID();
        incrementStudentCount();
    }   
     
    /**
     * Constructor with only name and student ID.
     * 
     * @param name the name of the student
     * @param studentID the student ID
     */
     
    public Student (String name, int studentID){
        this.name = name;
        this.studentID = studentID;
        this.group = "prolly in DiBSE23";
        this.proficiencyInJava = 0;
        this.gender = 'U';
        this.grades = new ArrayList<>();
        this.studentID = getNextStudentID();
        incrementStudentCount();
    }
    
     // Static method to get the next available student ID
     private static synchronized int getNextStudentID() {
        return nextStudentID++;
    }
    // Static method to increment student count and print the current count
    private static void incrementStudentCount() {
        studentCount++;
        System.out.println("\nNew Student added! There are a total of " + studentCount + " students.");
    }
    
    //getters and setters 
    
    /**
     * Gets the student's name.
     * @return the student's name
     */
    public String getName(){
        return name;
    }
    
    /**
     * Sets the student's name.
     * @param name the new name for the student
     */
    public void setName(String name){
        this.name = name;
    }
    
    /**
     * Gets the student's group.
     * @return the student's group
     */
    public String getGroup(){
        return group;
    }
    
    /**
     * Sets the student's group.
     * @param group the new group for the student
     */
    public void setGroup(String group){
        this.group = group;
    }
    
    /**
     * Gets the student's Java proficiency.
     * @return the student's Java proficiency
     */
    public int getProficiency(){
        return proficiencyInJava;
    }
    
    /**
     * Sets the student's Java proficiency.
     * @param proficiencyInJava the new Java proficiency level
     */
    public void setProficiency(int proficiencyInJava){
        this.proficiencyInJava = proficiencyInJava;
    }
    
    /**
     * Gets the student ID.
     * @return the student's ID
     */
    public int getStudentId(){
        return studentID;
    }
    
    /**
     * Sets the student ID.
     * @param studentID the new student ID
     */
    public void setStudentId(int studentID){
        this.studentID = studentID;
    }
    
    /**
     * Gets the student's gender.
     * @return the student's gender
     */
    public char getGender(){
        return gender;
    }
    
    /**
     * Sets the student's gender.
     * @param gender the new gender
     */
    public void setGender(char gender) {
        this.gender = gender;
    }
    
    /**
     * Compares the Java proficiency with another student.
     * @param anotherStudent another student to compare against
     * @return true if both students have the same Java proficiency level, false otherwise
     */
    public boolean hasSameFluencyInJavaAs(Student anotherStudent){
        return this.proficiencyInJava == anotherStudent.proficiencyInJava;
    }
    
    /**
     * Adds a grade for a course.
     * @param grade the grade to add
     */
    public void addGrade(float grade) {
        this.grades.add(grade);
    }
    
    /**
     * Calculates the average grade of the student.
     * @return the average grade, rounded to 1 decimal place
     */
    public float averageNote() {
        if (grades.isEmpty()) {
            return 0.0f; // if no grades are present, return 0.0 as average
        }
        float sum = 0;
        for (float grade : grades) {
            sum += grade;
        }
        return Math.round((sum / grades.size()) * 10) / 10.0f; // round to 1 decimal place
    }

    public static Student createStudentFromConsoleInput() {
        Scanner scanner = new Scanner(System.in);
        Student newStudent = new Student(); // Create a new Student object

        // prompt for name with validation (only letters and spaces)
        while (true) {
            System.out.print("Enter the student's name: ");
            String nameInput = scanner.nextLine();
            if (nameInput.matches("[a-zA-Z\\s]+")) {
                newStudent.setName(nameInput);
                break;
            } else {
                System.out.println("Invalid name. Please use only letters and spaces.");
            }
        }

        // prompt for group selection
        String[] randomGroups = {"Group A", "Group B", "Group C"};
        System.out.println("Select the student's group:");
        for (int i = 0; i < randomGroups.length; i++) {
            System.out.println((i + 1) + ". " + randomGroups[i]);
        }
        while (true) {
            System.out.print("Enter the number corresponding to the group: ");
            String groupInput = scanner.nextLine();
            try {
                int groupChoice = Integer.parseInt(groupInput);
                if (groupChoice >= 1 && groupChoice <= randomGroups.length) {
                    newStudent.setGroup(randomGroups[groupChoice - 1]);
                    break;
                } else {
                    System.out.println("Please enter a number between 1 and " + randomGroups.length + ".");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }

        // prompt for proficiencyInJava with validation
        while (true) {
            System.out.print("Enter the student's proficiency in Java (0-10): ");
            String proficiencyInput = scanner.nextLine();
            try {
                int proficiencyInJava = Integer.parseInt(proficiencyInput);
                if (proficiencyInJava >= 0 && proficiencyInJava <= 10) {
                    newStudent.setProficiency(proficiencyInJava);
                    break;
                } else {
                    System.out.println("Please enter a number between 0 and 10.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer between 0 and 10.");
            }
        }

        // prompt for gender with validation
        while (true) {
            System.out.print("Enter the student's gender (M/F/U): ");
            String genderInput = scanner.nextLine().toUpperCase();
            if (genderInput.length() == 1 && "MFU".contains(genderInput)) {
                newStudent.setGender(genderInput.charAt(0));
                break;
            } else {
                System.out.println("Invalid input. Please enter 'M', 'F', or 'U'.");
            }
        }

        // prompt the user to input 5 grades between 1 and 10
        System.out.println("Please enter 5 grades for the student (between 1 and 10):");
        for (int i = 0; i < 5; i++) {
            while (true) {
                System.out.print("Enter grade #" + (i + 1) + ": ");
                String gradeInput = scanner.nextLine();
                try {
                    float grade = Float.parseFloat(gradeInput);
                    if (grade >= 1 && grade <= 10) {
                        newStudent.addGrade(grade);
                        break;
                    } else {
                        System.out.println("Please enter a grade between 1 and 10.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a number between 1 and 10.");
                }
            }
        }


        return newStudent;
    }

    
    @Override
    public String toString(){
        return "\nName :" + this.name                 
                +"\nGroup :" + this.group
                +"\nStudent ID :" + this.studentID
                +"\nProficiency :" + this.proficiencyInJava
                +"\nGender :" + this.gender
                +"\nAverage Grade :" + averageNote();
    }
    
    /**
     * Checks if this student is the same as another student based on student ID.
     * @param obj the object to compare against
     * @return true if the student IDs are the same, false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Student student = (Student) obj;
        return studentID == student.studentID;
    }
}