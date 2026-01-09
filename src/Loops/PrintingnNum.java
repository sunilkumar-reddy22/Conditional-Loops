package Loops;
import java.util.Scanner;
public class PrintingnNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a integer: ");
        int num = in.nextInt();
        for(int n = 1; n <= num; n++){
            System.out.print(" " + n);
        }

    }
}
