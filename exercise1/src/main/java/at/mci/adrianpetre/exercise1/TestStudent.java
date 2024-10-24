/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package at.mci.adrianpetre.exercise1;

/**
 *
 * @author darth
 */
public class TestStudent {
    
    public static void main(String[] args){
        Student student1 = new Student();
        System.out.println(student1.toString());
    
        
        Student student2 = new Student("Adrian", "DiBSE Niche.", 8, 69420, 'M');
        System.out.println(student2.toString());

        // making a partial tinsae
        Student student3 = new Student("Tinky Winky", 67890);
        System.out.println(student3.toString());
        
        System.out.println("\ngiving " + student3.getName() + " some extra attributes \n"); 
        // giving tinsae some more info thorugh the use of setters
        student3.setProficiency(9);
        student3.setGroup("Group B");
        student3.setGender('F');
        System.out.println(student3.toString());    
        
        
        
    }
    
}
