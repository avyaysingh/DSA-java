package Recursion;

public class ProductOfDigits {
    public static void main(String[] args) {
        System.out.println(productOfDigits(2234));
    }
    static int productOfDigits(int num){
//        if (num == 0){
//            return 1;
//        }
//        return (num%10) * productOfDigits(num/10);

        // this way too
        if (num%10==num){
            return num;
        }
        return (num%10) * productOfDigits(num/10);
    }
}
