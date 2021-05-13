public class Smallest {
    public static void main(String[] args) {
        System.out.println(findSmallest(120, 2, -500));
    }

    private static int findSmallest(int num1, int num2, int num3) {
        return num1 < num2 ? (num1 < num3 ? num1 : num3) : (num2 < num3 ? num2 : num3);
    }
}
