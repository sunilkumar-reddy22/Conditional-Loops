package Loops;
import java.util.Scanner;
public class ReversingNums {
    public static void main(String[] args) {
        System.out.println("enter digits: ");
        Scanner input = new Scanner(System.in);
         int  num = input.nextInt();
     //   int num = 234906;
        int result = 0;
        while(num >0){
            int rem = num % 10;
            num /= 10;
            result = result *10 + rem;
        }
        System.out.println(result);
    }
}
