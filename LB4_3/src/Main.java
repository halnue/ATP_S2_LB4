import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter n");
        int n = new Scanner(System.in).nextInt();

        System.out.println("factorial      = " + factorial(BigInteger.valueOf(n)));
        System.out.println("factorialCycle = " + factorialCycle(n));
    }

    static BigInteger factorial(BigInteger n ){
        if (n == BigInteger.valueOf(0)) return BigInteger.valueOf(1);
        return n.multiply(factorial(n.subtract(BigInteger.valueOf(1))));
    }

    static BigInteger factorialCycle(long n){
        BigInteger result = BigInteger.valueOf(1);
        for (long i = 1; i <= n; i++) {
            result = (result.multiply(BigInteger.valueOf(i)));
        }
        return result;
    }

}