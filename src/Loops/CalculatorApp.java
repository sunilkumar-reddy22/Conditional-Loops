package Loops;
import java.sql.SQLOutput;
import java.util.Scanner;
public class CalculatorApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {

            System.out.println("\n====== Calculator menu =====");
            System.out.println("1.Addition");
            System.out.println("2.subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Divison");
            System.out.println("5.invalid user input check ");

            System.out.println("\nEnter you choice: ");
            int choice = input.nextInt();

            if (choice == 5) {
                System.out.println("Exiting Calculator...bye!");
                break;
            }
            System.out.println("Enter first number: ");
            int a = input.nextInt();
            System.out.println("Enter second number:");
            int b = input.nextInt();
            if (choice == 1) {
                System.out.println("result = " + (a + b));
            } else if (choice == 2) {
                System.out.println("result = " + (a - b));
            } else if (choice == 3) {
                System.out.println("result = " + (a * b));
            } else if (choice == 4) {

                if (b == 0) {
                    System.out.println("Error: cannot divided by zero! ");
                } else {
                    System.out.println("result = " + (a / b));

                }
            } else {
                System.out.println("Invalid choice! check again");
            }
        }
                input.close();



    }
}
