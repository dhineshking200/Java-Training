public class Leetcode1025 {
    public static boolean divisorGame(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        int[] tests = {2, 3, 4, 5};
        for (int n : tests) {
            System.out.println("n = " + n + " -> Alice wins? " + divisorGame(n));
        }
    }
}