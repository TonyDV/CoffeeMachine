import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String[] guestName = new String[8];
        for (int i=0; i<=7; i++) {
            guestName[i] = scanner.next();
        }
        for (int i=7; i>=0; i--) {
            System.out.println(guestName[i]);
        }
    }
}