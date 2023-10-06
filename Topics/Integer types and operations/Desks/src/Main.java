import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int groupStudentsCount1 = scanner.nextInt();
        int groupStudentsCount2 = scanner.nextInt();
        int groupStudentsCount3 = scanner.nextInt();
        int deskSeats = 2;
        int desksCount;

        desksCount = groupStudentsCount1 / deskSeats
                + groupStudentsCount1 % deskSeats;
        desksCount += groupStudentsCount2 / deskSeats
                + groupStudentsCount2 % deskSeats;
        desksCount += groupStudentsCount3 / deskSeats
                + groupStudentsCount3 % deskSeats;
        System.out.println(desksCount);
    }
}