package Recursion.arrays;

public class FindIfArrayIsSorted {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 9, 6, 7};
        System.out.println(isSorted(array));
    }

    static boolean isSorted(int[] array) {
        return isSortedHelper(array, 0);
    }

    static boolean isSortedHelper(int[] array, int index) {

        if (index == array.length - 1) {
            return true;
        }
        return array[index] < array[index + 1] && isSortedHelper(array, index + 1);
    }
}
