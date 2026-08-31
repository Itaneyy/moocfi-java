package pt6.pt2.averages;

import java.util.Scanner;

public class UserInterface {

    private GradeRegister register;
    private Scanner scanner;

    public UserInterface(GradeRegister register, Scanner scanner) {
        this.register = register;
        this.scanner = scanner;
    }

    public void start() {
        readPoints();
        System.out.println("");
        printGradeDistribution();
        printPointsAndGrades();
    }
    public void printPointsAndGrades(){
        System.out.println("The average of points : " +this.register.averageOfPoints());
  
        System.out.println("The average of grades : " +this.register.averageOfGrades());
  }

    public void readPoints() {
        while (true) {
            System.out.print("Points: ");
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            int points = Integer.valueOf(input);

            if (points < 0 || points > 100) {
                System.out.println("Impossible number.");
                continue;
            }

            this.register.addGradeBasedOnPoints(points);
        }
    }

    public void printGradeDistribution() {
        int grade = 5;
        while (grade >= 0) {
            int stars = register.numberOfGrades(grade);
            System.out.print(grade + ": ");
            printStars(stars);
            System.out.println("");

            grade = grade - 1;
        }
    }

    public static void printStars(int stars) {
        while (stars > 0) {
            System.out.print("*");
            stars--;
        }
    }
}

/*Final Sample output
Points: 82
Points: 83
Points: 96
Points: 51
Points: 48
Points: 56
Points: 61
Points:

5: *
4: **
3:
2: *
1: **
0: *
The average of points: 68.14285714285714
The average of grades: 2.4285714285714284
*/

