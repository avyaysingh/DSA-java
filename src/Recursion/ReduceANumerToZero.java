package Recursion;

public class ReduceANumerToZero {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));

    }
    private static int numberOfSteps(int num) {
        return numberOfStepsHelper(num, 0);
    }
    public static int numberOfStepsHelper(int num, int count){
        if (num==0){
            return count;
        }
        if (num%2==0){
            return numberOfStepsHelper(num/2, count+1);
        }
        return numberOfStepsHelper(num-1, count+1);
    }
}
