package Loops;
import java.util.Scanner;
public class CommonNumbers {
    public static void main(String[] args) {

        System.out.println("enter a integer: ");
 //       int num = 23454;
       while(true) {
           Scanner input = new Scanner(System.in);
           int num = input.nextInt();
           int count = 0;
           while (num > 0) {
               int rem = num % 10;
               if (rem == 4) {
                   count++;
               }
               num = num / 10;
           }

           System.out.println(count);
       }
    }
}
