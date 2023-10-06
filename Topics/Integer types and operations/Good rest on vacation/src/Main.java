import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int durationOfVacation = scanner.nextInt();
        int foodCostPerDay = scanner.nextInt();
        int oneWayFlightCost = scanner.nextInt();
        int costOfOneNight = scanner.nextInt();
        int requiredSum;

        requiredSum = durationOfVacation * foodCostPerDay;
        requiredSum += oneWayFlightCost + oneWayFlightCost;
        requiredSum += (durationOfVacation - 1) * costOfOneNight;
        System.out.println(requiredSum);
    }
}