import java.util.Scanner;

class MultipleFunction {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        System.out.println(f(x));
    }

    public static double f(double x) {
        //call your implemented methods here.
        double retValue;
        if (x <= 0) {
            retValue = f1(x);
        } else if (x > 0 && x < 1) {
            retValue = f2(x);
        } else {
            retValue = f3(x);
        }
        return retValue;

    }

    //implement your methods here
    public static double f1(double x) {
        return Math.pow(x, 2) + 1;
    }

    public static double f2(double x) {
        return 1 / Math.pow(x, 2);
    }

    public static double f3(double x) {
        return Math.pow(x, 2) - 1;
    }
}