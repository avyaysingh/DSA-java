package Recursion;

public class NumberOfZeroesInNumber {
    public static void main(String[] args) {
        System.out.println(countZeroes(2104056009));
    }

    public static int countZeroes(int num) {
        return countHelper(num, 0);
    }

    private static int countHelper(int num, int count) {
        if (num == 0) {
            return count;
        }
        int rem = num % 10;
        if (rem == 0) {
            return countHelper(num / 10, count+1);
        }
        return countHelper(num / 10, count);
    }
}
