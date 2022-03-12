package Recursion;

public class SumOfN {
    public static void main(String[] args) {
        System.out.println(sumOfN(5));
    }
    static int sumOfN(int num){
        if (num == 1){
            return 1;
        }
        return num + sumOfN(num-1);
    }

}
