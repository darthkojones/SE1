/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package at.mci.adrianpetre.exercise1;
import java.util.Scanner; //needed for the user input
import java.util.Random; //needed for the random
import java.util.ArrayList; //needed for dynamically removing names from the list

public class TestStudent {

    public static void main(String[] args) {

        // let's create user input to let the user decide how many students to create
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many students would you like to create? \n");
        int numStudents = Integer.parseInt(scanner.nextLine());  // Convert input to int
        System.out.print("Creating " + numStudents + " students.\n\n");

        // ask user whether to use true RNG or faux RNG
        // this is because we can't implement step 5 (check if 2 students are the same) in the faux RNG (since they can never be the same by definition)
        System.out.print("Would you like to use True RNG (can create students with the same name)\nor Faux RNG (non-repetitive names) for name selection?\n(Enter T/t for True, F/f for Faux): \n");
        char rngChoice = scanner.nextLine().trim().toUpperCase().charAt(0); //both lower and upper case

        // store the student objects in an array we'll call students         
        Student[] students = new Student[numStudents];
        
        // initial names array
        //String[] randomNames = {"Adrian", "Tinsae", "Marc", "Athena", "Odin", "Luna", "Melinoe", "Konamiya", "Geralt of Rivia", "Lara Croft", "Ezio Auditore da Firenze", "Kratos", "Leonardo da Vinci", "Niccolo Machiavelli", "Rodrigo Borgia"};
       
        // changed the names array to an ArrayList for easier removal of used names
        ArrayList<String> randomNames = new ArrayList<>();
        randomNames.add("Adrian");
        randomNames.add("Tinsae");
        randomNames.add("Marc");
        randomNames.add("Athena");
        randomNames.add("Odin");
        randomNames.add("Luna");
        randomNames.add("Melinoe");
        randomNames.add("Konamiya");
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

        // let's iterate and create students based on user's RNG choice
        if (rngChoice == 'T') {
            // true RNG path: names may repeat
            for (int i = 0; i < numStudents; i++) {
                // pick a random name (with repetition allowed)
                String randomName = randomNames.get(rand.nextInt(randomNames.size()));

                // pick a random group
                String randomGroup = randomGroups[rand.nextInt(randomGroups.length)];

                // pick a random gender (we'll convert the first character of the string to a char)
                char randomGender = randomGenders[rand.nextInt(randomGenders.length)].charAt(0);

                // create the student object with random attributes
                students[i] = new Student(randomName, randomGroup, rand.nextInt(11), i + 1, randomGender);

                // print each student out
                System.out.println(students[i].toString());
            }
        } else if (rngChoice == 'F') {
            // Faux RNG path: names do not repeat because they get deleted after use
            for (int i = 0; i < numStudents; i++) {
                // pick a random name (without repetition)
                int nameIndex = rand.nextInt(randomNames.size());
                String randomName = randomNames.get(nameIndex);
                randomNames.remove(nameIndex);  // remove the used name from the list

                // pick a random group
                String randomGroup = randomGroups[rand.nextInt(randomGroups.length)];

                // pick a random gender (we'll convert the first character of the string to a char)
                char randomGender = randomGenders[rand.nextInt(randomGenders.length)].charAt(0);

                // create the student object with random attributes
                students[i] = new Student(randomName, randomGroup, rand.nextInt(11), i + 1, randomGender);

                // print each student out
                System.out.println(students[i].toString());
            }
        } else {
            System.out.println("Invalid input. Please enter 'T' for True RNG or 'F' for Faux RNG.");
            return;
        }

        // look for students with the same Java proficiency
        if (numStudents > 1) {
            //we need at least 2 students to be able to compare them
            //we should iterate through the students and compare 
            //i dont know an easy fast way to do this
            //so i'mma brute force compare each student with each other student
            //basically an O(n^2) algo
            System.out.println("\nChecking and comparing proficiency between all students");

            // use nested loops to compare proficiency
            for (int i = 0; i < numStudents; i++) {
                for (int j = i + 1; j < numStudents; j++) {
                    boolean sameFluency = students[i].hasSameFluencyInJavaAs(students[j]);
                    if (sameFluency) {
                        System.out.println("Student " + students[i].getName() + " and student " + students[j].getName() + 
                                           " have the same proficiency of " + students[i].getProficiency() + ".");
                    } else {
                        System.out.println("Student " + students[i].getName() + " (" + students[i].getProficiency() + ")" + 
                                           " and student " + students[j].getName() + " (" + students[j].getProficiency() + ")" + 
                                           " have different proficiencies.");
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
        
   