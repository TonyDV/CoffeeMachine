import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String firstName = scanner.nextLine();
        String yearsOfExp = scanner.nextLine();
        String cuisinePref = scanner.nextLine();
        System.out.println("The form for " + firstName 
        + " is completed. We will contact you if we need a chef who cooks " 
        + cuisinePref + " dishes and has " + yearsOfExp + " years of experience.");
    }
}
