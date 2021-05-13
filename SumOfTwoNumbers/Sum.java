import java.util.*;

class Sum {
    public static void main(String[] args) {
        long num1 = 25000000000l;
        long num2 = 24000000000l;
        System.out.println(sum(12, 24));
        System.out.println(sum(1.2, 2.4));
        System.out.println(sum(num1, num2));

    }

    private static int sum(int num1, int num2) {
        return num1 + num2;
    }

    private static double sum(double num1, double num2) {
        return num1 + num2;
    }

    private static long sum(long num1, long num2) {
        return num1 + num2;
    }

}