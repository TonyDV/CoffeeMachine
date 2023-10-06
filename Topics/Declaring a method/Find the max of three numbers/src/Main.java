import java.util.Scanner;

public class Main {

    public static int getNumberOfMaxParam(int a, int b, int c) {
        // write a body here
        int orderMax = 1;
        if (a >= b && a >= c) {
            orderMax = 1;
        } else if (b >= a && b >= c) {
            orderMax = 2;
        } else if (c >= a && c >= b) {
            orderMax = 3;
        }
        return orderMax;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        final int c = scanner.nextInt();

        System.out.println(getNumberOfMaxParam(a, b, c));
    }
}