import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int unitsAmount;
        unitsAmount = scanner.nextInt();
        if (unitsAmount < 1 ) {
            System.out.println("no army");
        } else if (unitsAmount < 20) {
            System.out.println("pack");
        } else if (unitsAmount < 250) {
            System.out.println("throng");
        } else if (unitsAmount < 1000) {
            System.out.println("zounds");
        } else {
            System.out.println("legion");
        }
    }
}