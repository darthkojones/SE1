package at.mci.adrianpetre;

/*
 * this is code for assignment 2 exercise 2
 */
public class Test {
    private int a = 23;

    /*
     * Display the value of a
     */
    public void display() {
        System.out.println(this.a);
    }
}
/*
 * extended class of Test
 */
class ExtendedTest extends Test {
    private String a = "hello world";
}
/*
 * main fuction to test the classes
 */
class Main {
    public static void main(String[] args) {
        Test t = new Test();
        t.display(); // Outputs: 23

        ExtendedTest testEx = new ExtendedTest();
        testEx.display(); // Outputs: 23
    }
}

//the display method is defined in Test and uses this.a 
//since a is private in Test, this.a inside display() refers to Test's a
//testEx.display() calls the display method from Test, not from ExtendedTest
//therefore, the output is 23 for both calls
//the display method in the ExtendedTest class is not overridden, it is overloaded
//testEx.display() doesn't know about the string in extendedTest, it only knows about the int in Test




/*
 * this is code for assignment 2 exercise 5
 */

/*
try {
    some_single_instruction_1;
    some_single_instruction_2; <<<------ Exception is thrown here
    some_single_instruction_3;
}
catch (Exception1 ex1) {
    // Handle Exception1
}
catch (Exception2 ex2) {
    // Handle Exception2
}
some_single_instruction_4;

the asked quiestions
1. is some_single_instruction_3 executed?
2. what happens if exception is not caught?
3 is some_single_instruction_4 executed if the exception is caught in one of the catch blocks

1. some_single_instruction_3 is not executed because the exception is thrown before it
2. if the exception is not caught, it will propagate up the call stack until it is caught or the program terminates
3. yes some_single_instruction_4 is executed
   if the exception is caught, the catch block is executed and then the program continues with the next instruction

   try {
    some_single_instruction_1;
    some_single_instruction_2; <<- Exception thrown here
    some_single_instruction_3; <<- skipped
    }
   catch (Exception ex) {
      <<exception is caught and handled here>>
    }
      <<Execution resumes here>>
   some_single_instruction_4; <<-- this line is executed after exceptioin is caught

*/



