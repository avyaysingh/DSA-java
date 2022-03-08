package Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 88, 98, 108};
        System.out.println(search(arr, 98, 0, arr.length-1));
    }

    static int search(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int m = start + (end - start) / 2;
        if (arr[m] == target) {
            return m;
        }
        if (target < arr[m]) {
            return search(arr, target, start, m - 1);
        }
        return search(arr, target, m + 1, end);
    }
}
