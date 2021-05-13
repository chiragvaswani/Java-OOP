import java.sql.SQLSyntaxErrorException;

// WAP to verify if sum of digits of square of a number is the number itself
// Neon Numbers

public class Neon {
    public static void main(String[] args) {
        System.out.println(verifyDigits(9));
    }

    private static boolean verifyDigits(int num) {
        int squareNumber = num * num;
        int temp = 0;
        for (char ch : String.valueOf(squareNumber).toCharArray())
            temp += ch - '0';
        return temp == num ? true : false;
    }
}
