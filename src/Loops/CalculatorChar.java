package Loops;
import java.util.Scanner;
public class CalculatorChar {
    public static void main(String[] args) {
//        System.out.println("Enter operator: ");
        Scanner input = new Scanner(System.in);
        int result = 0;

        while (true) {
            System.out.println("Enter a  operator: ");
            char ch = input.next().trim().charAt(0);
            if(ch == 'y') {
                System.out.println("Exit bye");
                break;
            }
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%') {
                System.out.println("enter first value: ");
                int num1 = input.nextInt();
                System.out.println("enter second value:");
                int num2 = input.nextInt();

                if (ch == '+') {
                    result = num1 + num2;
                }
                if (ch == '-') {
                    result = num1 - num2;
                }
                if (ch == '*') {
                    result = num1 * num2;
                }

                if (ch == '/') {
                    if (num2 == 0) {
                        System.out.println("error cannot divide with 0");
                    }
                    if (ch == '/') {
                        result = num1 / num2;
                    }
                    if (ch == '%') {
                        if (num2 == 0) {
                            System.out.println("innvalid,cannot to  operation with zero");
                        }
                        if (ch == '%') {
                            result = num1 % num2;
                        }


                    }
                }
                System.out.println("Result = " + result);

            }


        }
    }

}
