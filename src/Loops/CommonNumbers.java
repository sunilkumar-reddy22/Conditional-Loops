package Loops;

public class CommonNumbers {
    public static void main(String[] args) {
        int num = 23454;
        int count = 0;
        while(num > 0) {
            int rem = num % 10;
            if (rem  == 4) {
                count++;
            }
              num  = num / 10;
        }

        System.out.println(count);
    }
}
