import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        // You can use scanner.nextBoolean() to read a boolean value
        int butterCupsAmount;
        boolean weekendFlag, responce;
        butterCupsAmount = scanner.nextInt();
        weekendFlag = scanner.nextBoolean();
        responce = !weekendFlag && ( butterCupsAmount >= 10 && butterCupsAmount <= 20)
                || weekendFlag && ( butterCupsAmount >= 15 && butterCupsAmount <= 25);
        System.out.println(responce);

    }
}