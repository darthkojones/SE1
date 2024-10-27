/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package at.mci.adrianpetre.exercise1;
import java.util.Scanner; //needed for the user input
import java.util.Random; //needed for the random

/**
 *
 * @author darth
 */


public class TestStudent {

    public static void main(String[] args) {

        // Let's create user input to let the user decide how many students to create
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many students would you like to create? \n");
        int numStudents = Integer.parseInt(scanner.nextLine());  // Convert input to int
        System.out.print("Creating " + numStudents + " students.\n");

        // Store the student objects in an array we'll call students         
        Student[] students = new Student[numStudents];

        // Let's make a few arrays, one for each attribute, so we can randomly assign one to each student
        String[] randomNames = {"Adrian", "Tinsae", "Marc", "Rudi", "Oliver", "Alice", "Bob", "Carol", "Dave"};
        String[] randomGroups = {"Group A", "Group B", "Group C"};  // Fixed typo
        String[] randomGenders = {"M", "F", "U"};

        Random rand = new Random();

        // Let's iterate and create students
        for (int i = 0; i < numStudents; i++) {
            // Pick a random name
            String randomName = randomNames[rand.nextInt(randomNames.length)];

            // Pick a random group
            String randomGroup = randomGroups[rand.nextInt(randomGroups.length)];

            // Pick a random gender (we'll convert the first character of the string to a char)
            char randomGender = randomGenders[rand.nextInt(randomGenders.length)].charAt(0);

            // Create the student object with random attributes
            students[i] = new Student(randomName, randomGroup, rand.nextInt(11), i + 1, randomGender);

            // Print each student out
            System.out.println(students[i].toString());
        }
        
        
        //look for same fluency
        if(numStudents > 1) { //we need at least 2 students to be able to compare them
            //we should iterate through the students and compare 
            //i dont know an easy fast way to do this
            //so i'mma brute force compare each student with each other student
            //basically an O(n^2) algo
            System.out.println("\nChecking and comparing fluency between all students");
            
            //nested loops works here
            for (int i = 0; i < numStudents; i++){
                for (int j = i + 1; j < numStudents; j++){
                    boolean sameFluency = students[i].hasSameFluencyInJavaAs(students[j]);
                    if (sameFluency) {
                        System.out.println("Student " + students[i].getName() + " and student " + students[j].getName() + " have the same proficiency");
                    } else {
                        System.out.println("Student " + students[i].getName() + " and student " + students[j].getName() + " have different proficiencies");
                    }
                }
            }
        }
        
        
        
        
    }
}
        
        
        
//        Student student1 = new Student();
//        System.out.println(student1.toString());
//    
//        
//        Student student2 = new Student("Adrian", "DiBSE Niche.", 8, 69420, 'M');
//        System.out.println(student2.toString());
//
//        // making a partial tinsae
//        Student student3 = new Student("Tinky Winky", 67890);
//        System.out.println(student3.toString());
//        
//        System.out.println("\ngiving " + student3.getName() + " some extra attributes \n"); 
//        // giving tinsae some more info thorugh the use of setters
//        student3.setProficiency(9);
//        student3.setGroup("Group B");
//        student3.setGender('F');
//        System.out.println(student3.toString());    
//        
        
   