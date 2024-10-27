/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package at.mci.adrianpetre.exercise1;
import java.util.Scanner; //needed for the user input
import java.util.Random; //needed for the random
import java.util.ArrayList; //needed for dynamically removing names from the list

/**
 * the main function where we play around with generating random students 
 * @author darth
 */
public class TestStudent {
     /**
     * main method used for testing of the Student class.
     * 
     * @param args Command line arguments
     */
    public static void main(String[] args) {

        // let's create user input to let the user decide how many students to create
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many students would you like to create? \n");
        int numStudents = Integer.parseInt(scanner.nextLine());  // Convert input to int
        System.out.print("Creating " + numStudents + " students.\n\n");

        // ask user whether to use true RNG or faux RNG
        // this is because we can't implement step 5 (check if 2 students are the same) in the faux RNG (since they can never be the same by implementation)
//        System.out.print("Would you like to use \n1.True RNG (can create students with the same name)\n2.Faux RNG (non-repetitive names)\n3.Pre-determined student stats ?\n(Enter 1 for True, 2 for Faux, 3 for Pre-determined): \n");
//        int rngChoice = Integer.parseInt(scanner.nextLine().trim());

        // store the student objects in an array we'll call students         
        Student[] students = new Student[numStudents];
        
        // initial names array
        //String[] randomNames = {"Adrian", "Tinsae", "Marc", "Athena", "Odin", "Luna", "Melinoe", "Konamiya", "Geralt of Rivia", "Lara Croft", "Ezio Auditore da Firenze", "Kratos", "Leonardo da Vinci", "Niccolo Machiavelli", "Rodrigo Borgia"};
       
        // changed the names array to an ArrayList for easier removal of used names in case 2
        ArrayList<String> randomNames = new ArrayList<>();
        randomNames.add("Adrian");
        randomNames.add("Tinsae");
        randomNames.add("Marc");
        randomNames.add("Athena");
        randomNames.add("Odin");
        randomNames.add("Luna");
        randomNames.add("Melinoe");
        randomNames.add("HE WHO SHALL NOT BE NAMED");
        randomNames.add("Geralt of Rivia");
        randomNames.add("Lara Croft");
        randomNames.add("Ezio Auditore da Firenze");
        randomNames.add("Kratos");
        randomNames.add("Leonardo da Vinci");
        randomNames.add("Niccolo Machiavelli");
        randomNames.add("Rodrigo Borgia");

        //arrays for groups and genders
        String[] randomGroups = {"Group A", "Group B", "Group C"};
        String[] randomGenders = {"M", "F", "U"};

        Random rand = new Random();

//        // Switch case to handle different RNG choices
//        switch (rngChoice) {
//            case 1:
//                // true RNG path: Names may repeat
//                for (int i = 0; i < numStudents; i++) {
//                    // pick a random name (with repetition allowed)
//                    String randomName = randomNames.get(rand.nextInt(randomNames.size()));
//
//                    // pick a random group
//                    String randomGroup = randomGroups[rand.nextInt(randomGroups.length)];
//
//                    // pick a random gender (we'll convert the first character of the string to a char)
//                    char randomGender = randomGenders[rand.nextInt(randomGenders.length)].charAt(0);
//
//                    // Create the student object with random attributes
//                    students[i] = new Student(randomName, randomGroup, rand.nextInt(11), i + 1, randomGender);
//
//                    // print each student out
//                    System.out.println(students[i].toString());
//                }
//                break;
//
//            case 2:
//                // faux RNG path: Names do not repeat
//                for (int i = 0; i < numStudents; i++) {
//                    // pick a random name (without repetition)
//                    int nameIndex = rand.nextInt(randomNames.size());
//                    String randomName = randomNames.get(nameIndex);
//                    randomNames.remove(nameIndex);  // Remove the used name from the list
//
//                    // pick a random group
//                    String randomGroup = randomGroups[rand.nextInt(randomGroups.length)];
//
//                    // pick a random gender (we'll convert the first character of the string to a char)
//                    char randomGender = randomGenders[rand.nextInt(randomGenders.length)].charAt(0);
//
//                    // create the student object with random attributes
//                    students[i] = new Student(randomName, randomGroup, rand.nextInt(11), i + 1, randomGender);
//
//                    // print each student out
//                    System.out.println(students[i].toString());
//                }
//                break;
//
//            case 3:
//                // Pre-determined student stats (by this i mean it's bound to have copies of the same studnet to check equals method functionality)
//                for (int i = 0; i < numStudents; i++) {
//                    // create the student objects similar to case 1
//                    String randomName = randomNames.get(rand.nextInt(randomNames.size()));
//                    String randomGroup = randomGroups[rand.nextInt(randomGroups.length)];
//                    char randomGender = randomGenders[rand.nextInt(randomGenders.length)].charAt(0);
//                    students[i] = new Student(randomName, randomGroup, rand.nextInt(11), i + 1, randomGender);
//
//                    // create two copies within the loop to demonstrate duplication
//                    if (i == numStudents - 2 && numStudents >= 3) {
//                        students[i] = students[1];  //copy of student 1
//                    } else if (i == numStudents - 1 && numStudents >= 3) {
//                        students[i] = students[2];  // copy of student 2
//                    }
//
//                    // print each student out
//                    System.out.println(students[i].toString());
//                }
//                break;
//
//
//            default:
//                System.out.println("Invalid input. Please enter 1 for True RNG, 2 for Faux RNG, or 3 for Pre-determined student stats.");
//                return;
//        }

        
        //decided to skip the whole case switching, since case 3 basically fulfills all of the assignment requirements
        
        
        //exercise 3 - THE RANDOM WAYYYYYYYY - you can seee the original implementation at the end, below
        for (int i = 0; i < numStudents; i++) {
                    // create the student objects similar to case 1
                    String randomName = randomNames.get(rand.nextInt(randomNames.size()));
                    String randomGroup = randomGroups[rand.nextInt(randomGroups.length)];
                    char randomGender = randomGenders[rand.nextInt(randomGenders.length)].charAt(0);
                    students[i] = new Student(randomName, randomGroup, rand.nextInt(11), i + 1, randomGender); //will add the grade field later
                    
                    // let's add some random gradeds so we can have something to work with when calculating the average
                    int numOfGrades = rand.nextInt(10)+2; //generates between 2 and 10 grades for each student
                    // now let's give those grades some values
                    for (int x = 0; x < numOfGrades; x++){
                        float grade = rand.nextFloat() * 10; // a random grade from 0 to 10
                        students[i].addGrade(grade); // adds the grade to the student's grade array
                    }
                    
                    
                    
                    
                    // create two copies within the loop to test equals() method
                    if (i == numStudents - 2 && numStudents >= 3) {
                        students[i] = students[1];  //copy of student 1
                    } else if (i == numStudents - 1 && numStudents >= 3) {
                        students[i] = students[2];  // copy of student 2
                    }

                    // print each student out
                    System.out.println(students[i].toString());
                }
        
        // exercise 4
        // look for students with the same Java proficiency  
        if (numStudents > 1) {
            //we need at least 2 students to be able to compare them
            //we should iterate through the students and compare 
            //i dont know an easy fast way to do this
            //so i'mma brute force compare each student with each other student
            //basically an O(n^2) algo
            System.out.println("\nChecking and comparing proficiency between all students\n");

            // use nested loops to compare proficiency
            for (int i = 0; i < numStudents; i++) {
                for (int j = i + 1; j < numStudents; j++) {
                    boolean sameFluency = students[i].hasSameFluencyInJavaAs(students[j]);
                    if (sameFluency) {
                        System.out.println("Student " + students[i].getName()+ " (ID " + students[i].getStudentId() + ")" + " and student " + students[j].getName()+" (ID " + students[j].getStudentId() + ")" + 
                                           " have the same proficiency of " + students[i].getProficiency() + ".");
                    } else {
                        //System.out.println("Student " + students[i].getName() + " (" + students[i].getProficiency() + ")" + 
                        //                   " and student " + students[j].getName() + " (" + students[j].getProficiency() + ")" + 
                        //                   " have different proficiencies.");
                    }
                }
            }
        }
        
        
        // exercise 5
        // let's test equals() method to check if all students are the same
        if (numStudents > 1) {
            System.out.println("\nTesting equality between all students\n");

            // inefficient nested loops as before
            for (int i = 0; i < numStudents; i++) {
                for (int j = i + 1; j < numStudents; j++) {
                    if (students[i].equals(students[j])) {
                        System.out.println("Student " + students[i].getName()+" (ID " + students[i].getStudentId() + ")" + " is the same as student " + students[j].getName()+" (ID " + students[j].getStudentId() + ")" + ".");
                    } else {
                       // System.out.println("Student " + students[i].getName() + " is not the same as student " + students[j].getName() + ".");
                    }
                }
            }
        }
    }
}

 
        
        //exercise 9 

    
//      sInt = null;  -> CORRECT
//      this sets the reference sInt to null, meaning it points to no object at all.
    
//      sInt = student;  -> CORRECT
//      this assigns the reference sInt to point to the student object,  this is correct because Student implements StudentInterface
    
//      student = sInt; -> WRONG
//      this causes a compilation error because sInt is of type StudentInterface and it has to be assigned to a Student object
    
//      sInt = new StudentInterface(); -> WRONG
//      this causes a compilation error since interfaces cannot be instantiated directly
    
//      sInt.someMethodInStudentInterface(); -> CORRECT-ish
//      this will work IF someMethodInStudentInterface() is defined in the interface and implemented in the Student class






        //exercise 3
        //This is the initial implementation of the student objects, which i then decided to randomize for the fun of experimentation
        
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