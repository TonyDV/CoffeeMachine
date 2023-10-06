import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int h1 = scanner.nextInt();
        int h2 = scanner.nextInt();
        int h3 = scanner.nextInt();

        boolean descOrdered = h1 > 0 && (h2 <= 0 && h3 <= 0)
                || h2 > 0 && (h1 <= 0 && h3 <= 0)
                || h3 > 0 && (h2 <= 0 && h1 <= 0);

        System.out.println(descOrdered);
    }
}
