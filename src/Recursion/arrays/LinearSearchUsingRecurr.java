package Recursion.arrays;

import java.util.ArrayList;
import java.util.List;

public class LinearSearchUsingRecurr {
    public static void main(String[] args) {
        int[] arr = {20, 4, 6, 7, 4, 23, 33, 90, 23};
        System.out.println(find(arr, 900, 0));
        System.out.println(findIndex(arr, 90, 0));
        System.out.println(findIndexFromLast(arr, 33, 6));

        //finding all the indices
        findAllIndex(arr, 4, 0);
        System.out.println(list);

        //returning the arraylist of indices
        System.out.println(findAllIndices(arr, 4, 0));


        System.out.println(findAllIndices2(arr, 23, 0));
    }

    static boolean find(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;
        }
        return (arr[index] == target) || find(arr, target, index + 1);
    }

    static int findIndex(int[] array, int target, int index) {
        if (index == array.length) {
            return -1;
        }
        if (array[index] == target) {
            return index;
        }
        return findIndex(array, target, index + 1);
    }

    static int findIndexFromLast(int[] arr, int target, int index) {
        if (index == -1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        return findIndexFromLast(arr, target, index - 1);
    }

    static ArrayList<Integer> list = new ArrayList<>();

    static void findAllIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        findAllIndex(arr, target, index + 1);
    }


    //find all indices and return as list
    static ArrayList findAllIndices(int[] arr, int target, int index) {
        ArrayList<Integer> listN = new ArrayList<>();
        findAllIndicesHelper(arr, target, index, listN);
        return listN;
    }

    static ArrayList findAllIndicesHelper(int[] arr, int target, int index, ArrayList<Integer> listN) {
        if (index == arr.length) {
            return listN;
        }
        if (arr[index] == target) {
            listN.add(index);
        }
        findAllIndicesHelper(arr, target, index + 1, listN);
        return listN;
    }


    // not taking arraylist in argument (not at all efficient):--
    static ArrayList<Integer> findAllIndices2(int[] array, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if (index == array.length) {
            return list;
        }
        if (array[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> answerFromBelowCalls = findAllIndices2(array, target, index + 1);
        list.addAll(answerFromBelowCalls);
        return list;
    }
}
