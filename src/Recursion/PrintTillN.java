package Recursion;

public class PrintTillN {
    public static void main(String[] args) {
        printN(5);
        printTill(5);
        System.out.println("******** printing both **********");
        printBoth(5);
    }
    static void printN(int n){
        if (n == 0){
            return;
        }
        System.out.println(n);
        printN(n-1);
    }
    static void printTill(int n){
        if (n==0){
            return;
        }
        printTill(n-1);
        System.out.println(n);

    }
    static void printBoth(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        printBoth(n-1);
        System.out.println(n);
    }
}
