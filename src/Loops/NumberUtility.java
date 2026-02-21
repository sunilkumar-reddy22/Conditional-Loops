package Loops;
import java.util.Scanner;
public class NumberUtility {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        while (true) {

            System.out.println("\n====Number utility====");
            System.out.println("1.count digits");
            System.out.println("2.reversing digits");
            System.out.println("3.fabinacci number");
            System.out.println("4.even or odd number");
            System.out.println("5.palindrome");
            System.out.println("6.factorial");
            System.out.println("7.max number");
            System.out.println("8.Square and cube");
            System.out.println("\nyour choice: ");
            int choice = num.nextInt();
            if (choice == 8) {
                System.out.println("Exit");
                break;

            }
            if (choice == 1) {
                System.out.println("Enter a number: ");
                int n1 = num.nextInt();
                int count = 0;
                while (n1 > 0) {
                    int rem = n1 % 10;
                    if (rem == 4) {
                        count++;
                    }
                    n1 = n1 / 10;
                }

                System.out.println(count);

            }
            if (choice == 2) {
                System.out.println("Enter a number: ");
                int n2 = num.nextInt();
                int result = 0;
                while (n2 > 0) {
                    int rem = n2 % 10;
                    n2 = n2 / 10;
                    result = result * 10 + rem;

                }
                System.out.println(result);
            }
            if (choice == 3) {
                System.out.println("Enter a Nth fabi Number: ");
                int n3 = num.nextInt();
                int a = 0;
                int b = 1;
                int count = 2;
                while (count <= n3) {
                    int temp = b;
                    b = b + a;
                    a = temp;
                    count++;
                }
                System.out.println(b);
            }
            if (choice == 4) {
                System.out.println("enter even odd check nums");
                int k = num.nextInt();
                int rem = k % 2;
                if (rem == 0) {
                    System.out.println("is even");
                } else {
                    System.out.println("is odd");
                }
            }
            if (choice == 5) {
                System.out.println("check palindrome or not");
                int palin = num.nextInt();
                int original = 0;
                int temp = palin;
                while (palin > 0) {
                    int rem = palin % 10;
                    palin = palin / 10;

                    original = original * 10 + rem;
                }
                if (temp == original) {
                    System.out.println("is plidrome");
                } else {
                    System.out.println("is not a palindrome");
                }
            }
            if (choice == 6) {
                System.out.println("enter a factorial number: ");
                int num6 = num.nextInt();
                int fact = 1;
                for (int i = 1; i <= num6; i++) {
                    fact = fact * i;
                }
                System.out.println(fact);

            }
            if (choice == 7) {
                System.out.println("Find max number:");
                int x = num.nextInt();
                int y = num.nextInt();
                int z = num.nextInt();
                int max = Math.max(z, Math.max(x, y));
                System.out.println(max);
            } else {
                System.out.println("invalid value! check again");
            }
        }


    }
}




















