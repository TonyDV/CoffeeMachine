import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int sum = 0;
        int elem = 1;
        while (elem != 0) {
            elem = scanner.nextInt();
            if (elem != 0) {
                sum += elem;
            }

        }
        System.out.println(sum);
    }
}