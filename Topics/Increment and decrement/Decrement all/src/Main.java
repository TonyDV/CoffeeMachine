import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int inputNumber;
        String outputString="";
        for(int i=0; i<4; i++) {
            inputNumber = scanner.nextInt();
            outputString += --inputNumber + " ";
        }
        System.out.println(outputString.trim());
    }
}