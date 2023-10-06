import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int threeDigitNumber = scanner.nextInt();
        System.out.print((threeDigitNumber % 100 % 10 > 0) ? threeDigitNumber % 100 % 10 : "");
        System.out.print(threeDigitNumber % 100 / 10);
        System.out.print(threeDigitNumber / 100);
    }
}
