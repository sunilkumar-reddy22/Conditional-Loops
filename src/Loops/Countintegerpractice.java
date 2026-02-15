package Loops;

public class Countintegerpractice {
    public static void main(String[] args) {
        long num = 234456;
        int count = 0;
        while (num > 0) {
            long rem = num % 10;
            if (rem == 4) {
                count++;
            }
            num = num / 10;
        }
        System.out.println(count);

        System.out.println("\nReverse number: ");
        long num1 = 74684;
        long  ans = 0;
        while (num1 > 0) {
            long  rem1 = num1 % 10;
            ans = ans * 10 + rem1;
            num1 = num1 / 10;

        }
        System.out.println(ans);
    }
}



