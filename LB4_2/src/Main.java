import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter n");
        int n = new Scanner(System.in).nextInt();
//        for (int n = 0; n < 11; n++) {
            System.out.println("n = " + n);
            System.out.println("powArithmetic = " + powArithmetic(n));
            System.out.println("powBit        = " + powBit(n));
//        }
    }

    static int powArithmetic(int n){
        if (n< 0 || n>10)
            throw new IndexOutOfBoundsException();
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= 8;
        }
        return result;
    }

    static int powBit(int n){
        if (n< 0 || n>10)
            throw new IndexOutOfBoundsException();
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result <<= 3;
        }
        return result;
    }


}
