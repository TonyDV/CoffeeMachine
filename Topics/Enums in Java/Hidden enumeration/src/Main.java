public class Main {

    public static void main(String[] args) {
        int counter = 0;
        final String prefix = "STAR";

        // write your code here
        for (Secret status : Secret.values()) {
            if (status.toString().startsWith(prefix)) {
                counter++;
            }
        }

        System.out.println(counter);
    }
}

/* sample enum for inspiration
enum Secret {
    STAR, CRASH, START
}
*/