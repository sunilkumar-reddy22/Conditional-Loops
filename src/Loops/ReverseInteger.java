package Loops;

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println("give values mate: ");
        int num =56478;
        int result = 0;
        while(num > 0) {
            int rem = num % 10;
            num = num / 10;

            result = result * 10 + rem;
        }
        System.out.println(result);
    }
}
