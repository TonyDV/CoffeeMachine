import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int sum = 0, elem = 1;
        int  limit = 1000;
        while (sum < limit && elem != 0) {
            elem = scanner.nextInt();
            sum += elem;
        }
        System.out.println((sum >= limit) ? sum - limit : sum);
    }
}