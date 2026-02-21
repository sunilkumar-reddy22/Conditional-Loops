package Loops;
import java.util.Scanner;
public class ProjectNumberutility {
    public static void main(String[] args) {
        Scanner utility = new Scanner(System.in);
        while(true) {
            System.out.println("\n====Number Utility=====");
            System.out.println("1.Reverse Number");
            System.out.println("2.Count Digits");
            System.out.println("3.Check Prime");
            System.out.println("4.Check even or odd");
            System.out.println("5.fabinacci number");
            System.out.println("6.Check palindrome");
            System.out.println("7.Check Max number");
            System.out.println("8.Factorial Number");
            System.out.println("9.Square and Cube");
            System.out.println("10.Math tables");
            System.out.println("\nchoice: ");
            int choice = utility.nextInt();
             switch (choice) {

                 case 1:
                     System.out.println("Enter Number: ");
                     int num1 = utility.nextInt();
                     int result = 0;
                     while (num1 > 0) {
                         int rem = num1 % 10;
                         num1 = num1 / 10;
                         result = result * 10 + rem;
                     }
                     System.out.println("Result  = " + result);
                     break;

                 case 2:
                     System.out.println("Enter Number");
                     int num2 = utility.nextInt();
                     int count = 0;
                     while (num2 > 0) {
                         num2 = num2 / 10;
                         count++;
                     }
                     System.out.println("Couunt = " + count);
                     break;

                 case 3:
                     System.out.println("EnterNumber");
                     int num3 = utility.nextInt();
                     boolean isprime = true;
                     if (num3 <= 0) {
                         isprime = false;
                     } else {
                         for (int i = 2; i * i < num3; i++) {
                             if (num3 % i == 0) {
                                 isprime = false;
                             }
                         }
                     }
                     if (isprime) {
                         System.out.println("is prime nmber = " + isprime);
                     } else {
                         System.out.println("not a prime number");
                     }
                     break;

                 case 4:
                     System.out.println("enter Number");
                     int num4 = utility.nextInt();
                     for (int i = 0; i < num4; i++) {
                         if (num4 % i == 0) {
                             System.out.println("result = " + " even");
                         } else {
                             System.out.println("is odd number");
                         }
                     }
                     break;

                 case 5:
                     System.out.println("Enter Number");
                     int num5 = utility.nextInt();
                     int x = 0;
                     int y = 1;
                     int count1 = 2;

                     while (count1 <= num5) {
                         int temp = y;
                         y = y + x;
                         x = temp;
                         count1++;
                     }
                     System.out.println(y);
                     break;

                 case 6:
                     System.out.println("Enter Number");
                     int num6 = utility.nextInt();
                     int aunth = 0;
                     int temp = num6;

                     while (num6 > 0) {
                         int rem = num6 % 10;
                         num6 = num6 / 10;
                         aunth = aunth * 10 + rem;
                     }
                     if (aunth == temp) {
                         System.out.println(" is a palindrome");
                     } else {
                         System.out.println("not a palindrome");
                     }
                     break;
                 case 7:
                     System.out.println("Enter a Number");
                     int x1 = utility.nextInt();
                     int y1 = utility.nextInt();
                     int z1 = utility.nextInt();
                     int max = Math.max(z1, Math.max(x1, y1));
                     System.out.println(max);

                     break;

                 case 8:
                     System.out.println("Enter Number");
                     int num8 = utility.nextInt();
                     int fact = 1;
                     for (int i = 1; i <= num8; i++) {
                         fact = fact * i;
                     }
                     System.out.println(fact);
                     break;

                 case 9:
                     System.out.println("1.square");
                     System.out.println("2.cube");
                     int powerchoice = utility.nextInt();
                     switch (powerchoice) {

                         case 1:
                             System.out.println("Enter Number");
                             int n1 = utility.nextInt();
                             int square = n1 * n1;
                             System.out.println(square);

                             break;
                         case 2:
                             System.out.println("Enter Number");
                             int n2 = utility.nextInt();
                             int cube = n2 * n2;
                             System.out.println(cube);
                             break;
                     }
                 case 10:
                     System.out.println("Enter number");
                     int n = utility.nextInt();
                     for(int i = 1; i <=10; i++) {
                         System.out.println(n + " x " + i + " = " + (n * i));
                     }
                     break;

                 default:
                     System.out.println("Inavlid choice!");




             }

        }


    }
}
