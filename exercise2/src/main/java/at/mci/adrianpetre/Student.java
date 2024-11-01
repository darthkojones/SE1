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
        incrementStudentCount();
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
        String name;
        String group;
        int proficiencyInJava;
        int studentID;
        char gender;
    
        // Prompt for name
        System.out.print("Enter the student's name: ");
        name = scanner.nextLine();
    
        // Prompt for group
        System.out.print("Enter the student's group: ");
        group = scanner.nextLine();
    
        // Prompt for proficiencyInJava with validation
        while (true) {
            System.out.print("Enter the student's proficiency in Java (0-10): ");
            String proficiencyInput = scanner.nextLine();
            try {
                proficiencyInJava = Integer.parseInt(proficiencyInput);
                if (proficiencyInJava >= 0 && proficiencyInJava <= 10) {
                    break;
                } else {
                    System.out.println("Please enter a number between 0 and 10.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer between 0 and 10.");
            }
        }
    
        // Prompt for studentID with validation
        while (true) {
            System.out.print("Enter the student's ID: ");
            String idInput = scanner.nextLine();
            try {
                studentID = Integer.parseInt(idInput);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer ID.");
            }
        }
    
        // Prompt for gender with validation
        while (true) {
            System.out.print("Enter the student's gender (M/F/U): ");
            String genderInput = scanner.nextLine();
            if (genderInput.length() == 1 && "MFU".contains(genderInput.toUpperCase())) {
                gender = genderInput.toUpperCase().charAt(0);
                break;
            } else {
                System.out.println("Invalid input. Please enter 'M', 'F', or 'U'.");
            }
        }
    
        // Create and return the new Student object
        Student newStudent = new Student(name, group, proficiencyInJava, studentID, gender);
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