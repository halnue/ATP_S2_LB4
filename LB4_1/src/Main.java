import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Function fun = new Function(10.0);
        System.out.println("Enter x0");
        double x0 = new Scanner(System.in).nextDouble();

        System.out.println("Enter x1");
        double x1 = new Scanner(System.in).nextDouble();

        System.out.println("Enter step");
        double step = new Scanner(System.in).nextDouble();

        for (double x = x0; x < x1; x += step){
            System.out.println("X = " + x + "Y = " + fun.getY(x));
        }
    }

}

class Function {

    private double n;

    public Function(double n) {
        this.n = n;
    }

    public double getY(double x) {
        if (x<=20.0) return funXLess20(x);
        return funXMore20(x);
    }

    private double funXMore20(double x) {
        double root = Math.pow(((0.5 * x - 9)), 1.0 / 3);
        return -1 * root + 2 * n + 1;
    }

    private double funXLess20(double x) {
        double multiply = 1;
        for (int i = 1; i < n; i++) {
            multiply *= Math.sin(0.1 * x - 0.02 * i + 1);
        }
        return x + 12 * multiply;
    }
}