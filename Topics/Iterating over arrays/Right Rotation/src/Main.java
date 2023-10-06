import java.util.Scanner;
import java.util.Arrays;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String[] entrance = scanner.nextLine().split(" ");
        int numberOfRotations = scanner.nextInt();

        for (int i = 0; i < numberOfRotations; i++) {
            String tmp = entrance[entrance.length - 1];
            for (int b = entrance.length - 2; b >= 0; b--) {
                entrance[b + 1] = entrance [b];
            }
            entrance[0] = tmp;
        }
        Arrays.stream(entrance).forEach(e -> System.out.print(e + " "));

    }
}