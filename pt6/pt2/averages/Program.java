package pt6.pt2.averages;

import java.util.*;

public class Program {

    public static void main(String[] args) {
        // GradeRegister register = new GradeRegister();
        // register.addGradeBasedOnPoints(93);
        // register.addGradeBasedOnPoints(91);
        // register.addGradeBasedOnPoints(92);
      //  System.out.println(register.averageOfPoints());
        
        Scanner scanner = new Scanner(System.in);

        GradeRegister register = new GradeRegister();

        UserInterface userInterface = new UserInterface(register, scanner);
        userInterface.start();
    
    // GradeRegister register = new GradeRegister();
    // register.addGradeBasedOnPoints(93);
    // register.addGradeBasedOnPoints(91);
    // register.addGradeBasedOnPoints(92);
    // register.addGradeBasedOnPoints(88);
  //  System.out.println(register.averageOfGrades());
    }
}
