/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package at.mci.adrianpetre.exercise1;

/**
 *
 * @author darth
 */
public class Student {
    
    // data fields
    private String name;
    private String group;
    private int proficiencyInJava;
    private int studentID;
    private char gender;
    
    
    // constructor 
    // default aka no arguments
    public Student(){
        this.name = "HE WHO SHALL NOT BE NAMED";
        this.group = "prolly in DiBSE23";
        this.proficiencyInJava = 0; //maybe 1?
        this.studentID = 0; //can this be null?
        this.gender = 'U'; // unknown but it's 2024, you can't assume gender anymore
    }     
     
    //constructor
    //with fields passed as arguments
    
     public Student(String name, String group, int proficiencyInJava, int studentID, char gender){
        this.name = name;
        this.group = group;
        this.proficiencyInJava = proficiencyInJava;
        this.studentID = studentID; //can this be null?
        this.gender = gender; // unknown but it's 2024, you can't assume gender anymore
    }   
     
     /*does a constructor with maybe only student name and ID make sense?
     * as it is maybe the information we care most about at first
     */
     
    public Student (String name, int studentID){
        this.name = name;
        this.studentID = studentID;
        this.group = "prolly in DiBSE23";
        this.proficiencyInJava = 0;
        this.gender = 'U';
    }
    
    //getters and setters 
    public String getName(){
        return name;
        }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getGroup(){
        return group;
    }
    
    public void setGroup(String group){
        this.group = group;
    }
    
    public int getProficiency(){
        return proficiencyInJava;
    }
    
    public void setProficiency(int proficiencyInJava){
        this.proficiencyInJava = proficiencyInJava;
    }
    
    public int getStudentId(){
        return studentID;
    }
    
    public void setStudentId(int studentID){
        this.studentID = studentID;
    }
    
    public char getGender(){
        return gender;
    }
    
    public void setGender(char gender) {
        this.gender = gender;
    }
    
    public boolean hasSameFluencyInJavaAs(Student anotherStudent){
        return this.proficiencyInJava == anotherStudent.proficiencyInJava;
    }
    
    @Override
    public String toString(){
        return "\nName :" + this.name                 
                +"\nGroup :" + this.group
                +"\nStudent ID :" + this.studentID
                +"\nProficiency :" + this.proficiencyInJava
                +"\nGender :" + this.gender;
    }
    
    
    
    
}
