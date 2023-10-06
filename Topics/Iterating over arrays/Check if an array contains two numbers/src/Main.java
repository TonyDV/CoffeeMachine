import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int[] words = new int[arrayLength];
        for (int i=0; i<arrayLength; i++) {
            words[i] = scanner.nextInt();
        }
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        boolean flag = false;
        for (int i=0; i<arrayLength - 1; i++) {
            if (words[i] == n && words[i+1] == m
            || words[i] == m && words[i+1] == n) {
                flag = true;
                break;
            }
        }
        System.out.println(flag);

    }
}