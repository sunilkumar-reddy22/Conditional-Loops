package Loops;
import java.util.Scanner;
public class PrintingnNum {
    public static void main(String[] args) {
        System.out.println("Enter a numbr :");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for (int n = 1; n <= num; n++) {
            System.out.print(n + " ");
  //          System.out.println("Hello World");
        }
    }
}
