package Loops;

public class Countintegerpractice {
    public static void main(String[] args) {
        long num = 234456;
        int count = 0;
        while(num > 0) {
             long  rem = num % 10;
            if (rem == 4) {
                count++;
            }
            num = num / 10;
        }
        System.out.println(count);
    }

}
