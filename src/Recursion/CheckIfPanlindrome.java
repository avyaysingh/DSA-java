package Recursion;

public class CheckIfPanlindrome {
    public static void main(String[] args) {
        System.out.println(pal(123454321));
    }

    static boolean pal(int num) {
        return num == rev(num);
    }

    static int rev(int num) {
        int digits = (int) (Math.log10(num)) + 1;
        return revHelper(num, digits);
    }

    private static int revHelper(int num, int digits) {
        if (num % 10 == 0) {
            return num;
        }
        int rem = num % 10;
        return rem * (int) Math.pow(10, digits - 1) + revHelper(num / 10, digits - 1);
    }
}
