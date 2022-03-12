package Recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(1342));
    }

    static int sumOfDigits(int num) {
        if (num==0){
            return 0;
        }
        return (num % 10) + sumOfDigits(num / 10);
    }
}
