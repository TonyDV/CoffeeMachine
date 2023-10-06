import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int N, M, K;
        N = scanner.nextInt();
        M = scanner.nextInt();
        K = scanner.nextInt();
        String responce = "YES";
        if (K > N * M || (K < N || K < M)) {
            responce = "NO";
        }
        if (!(K % N == 0 || K % M == 0)) {
            responce = "NO";
        }
        System.out.println(responce);
    }
}