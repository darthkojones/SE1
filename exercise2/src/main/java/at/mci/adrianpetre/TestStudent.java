package at.mci.adrianpetre;


import java.util.ArrayList; //needed for the user input
import java.util.Random; //needed for the random
import java.util.Scanner; //needed for dynamically removing names from the list

/**
 * the main function where we play around with generating random students 
 * @author darth
 */
public class TestStudent {

    /**
     * Method to display a number of students from an array of students
     * 
     * @param students Array of students
     */
    public static void displayStudents(Student[] students) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter the number of students to display:");
        int nrObjsToDisplay;
        try {
            nrObjsToDisplay = Integer.parseInt(scanner.nextLine());
            if (nrObjsToDisplay <0 || nrObjsToDisplay > students.length) {
                throw new OutOfBoundsException("The number of students to display is out of bounds.");
            }
            System.out.println("Displaying " + nrObjsToDisplay + " students:");
            for (int i = 0; i < nrObjsToDisplay; i++) {
                System.out.println(students[i].toString());
            }
        } catch (OutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid number (INT)");
        }

    }
    
    
    
    
    
    /**
     * main method used for testing of the Student class.
     * 
     * @param args Command line arguments
     */

        
    public static void main(String[] args) {
        System.out.println("\nCreating a new Student via console input:");
        Student inputStudent = Student.createStudentFromConsoleInput();
        // let's create user input to let the user decide how many students to create
       
        /*
         * exercise 2.7 - create a number of students based on user input
         * just that i changed the name of the variable to numStudents 
         * instead of the suggested nrStud
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many students would you like to create? \n");
        int numStudents = Integer.parseInt(scanner.nextLine());  // Convert input to int
        System.out.print("Creating " + numStudents + " students.\n\n");

        
        // store the student objects in an array we'll call students         
        Student[] students = new Student[numStudents];
        
        
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

        //print the student created from console input
        System.out.println(inputStudent.toString());
         /*
         * some courses that a TA can teach for exercise 2.3
         */
        ArrayList<String> taCourses = new ArrayList<>();
        taCourses.add("Java");
        taCourses.add("Python");
        taCourses.add("C++");
        taCourses.add("C#");
        TAStudent taStudent = new TAStudent("Tinsae", 69, taCourses, "Tutor");
        System.out.println(taStudent.toString());

        /*
         * PHD student for exercise 2.4
         */
        PhDStudent phdStudent = new PhDStudent("Adrian", 69420, "AI Pornography- Fad or Future?", "Andrea Corradini", true);
        System.out.println(phdStudent.toString());

        
        //exercise 1.3 - THE RANDOM WAYYYYYYYY - you can seee the original implementation at the end, below
        for (int i = 0; i < numStudents; i++) {
                    // create the student objects similar to case 1
                    //String randomName = randomNames.get(rand.nextInt(randomNames.size()));
                    int nameIndex = rand.nextInt(randomNames.size());
                    String randomName = randomNames.get(nameIndex);
                    randomNames.remove(nameIndex);  // Remove the used name from the list
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
                        students[i] = students[1];  //copy of student 2
                    } else if (i == numStudents - 1 && numStudents >= 3) {
                        students[i] = students[0];  // copy of student 1
                    }

                    // print each student out
                    //System.out.println(students[i].toString());
                }

        displayStudents(students);
        // exercise 1.4
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

 
   