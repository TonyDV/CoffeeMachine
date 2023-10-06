import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String inputWord;
        String checkPrefix = "J";
        inputWord = scanner.nextLine();
        System.out.println(inputWord.toUpperCase().startsWith(checkPrefix));
    }
}