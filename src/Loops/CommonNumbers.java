package Loops;
import java.util.Scanner;
public class CommonNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
 //       int num = 23454;
       while(true) {
           System.out.println("enter a integer (-1 to stop): ");
           int num = input.nextInt();
           int count = 0;
           while (num > 0) {
               int rem = num % 10;
               if (rem == 4 || rem == 1 || rem == 2 || rem == 3 ) {
                   count++;
               }
               num = num / 10;
           }

           System.out.println(count);
       }
    }
}
