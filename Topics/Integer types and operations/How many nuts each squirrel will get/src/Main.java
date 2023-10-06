import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int squirrelCount = scanner.nextInt();
        int nutCount = scanner.nextInt();
        System.out.println(nutCount / squirrelCount);
    }
}