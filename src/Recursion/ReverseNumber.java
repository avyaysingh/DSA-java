package Recursion;

public class ReverseNumber {
    public static void main(String[] args) {
        reverseNumber(12345);
        System.out.println();
        reverseNumber(18433);

        System.out.println();
        rev1(12345);
        System.out.println(sum);

        System.out.println(rev2(123456));
    }

    // my way
    static void reverseNumber(int num) {
        if (num % 10 == 0) {
            return;
        }
        System.out.print(num % 10);
        reverseNumber(num / 10);
    }


    //way -1
    static int sum = 0;

    static void rev1(int n) {
        if (n == 0) {
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        rev1(n / 10);
    }

    //way-2
    static int rev2(int n) {
        int digits = (int) (Math.log10(n)) + 1;
        return rev2Helper(n, digits);
    }

    private static int rev2Helper(int n, int digits) {
        if (n % 10 == n) {
            return n;
        }
        int rem = n % 10;
        return rem * (int) Math.pow(10, digits - 1) + rev2Helper(n / 10, digits - 1);
    }

}
