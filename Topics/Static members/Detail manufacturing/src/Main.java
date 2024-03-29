import java.util.Scanner;

class ManufacturingController {
    // here you may declare a field
    static int totalRequest;

    public static String requestProduct(String product) {
        // write your code here
        totalRequest++;
        return totalRequest + ". Requested " + product;
    }

    public static int getNumberOfProducts() {
        // write your code here
        return totalRequest;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String product = scanner.nextLine();
            System.out.println(ManufacturingController.requestProduct(product));
            System.out.println(ManufacturingController.getNumberOfProducts());
        }
    }
}