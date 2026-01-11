package Loops;

public class DigitsManipulation {
    public static void main(String[] args) {
        int num = 35752;
        int count = 0;
                while(num > 0){
                  int n = num % 10;
                  if(n == 5){
                      count++;
                  }
                   num = num / 10;
                }
        System.out.println(count);
    }
}
