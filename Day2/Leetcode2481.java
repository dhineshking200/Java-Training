public class Leetcode2481 {
    public static int numberOfCuts(int n) {
        if (n == 1) return 0;
        return (n % 2 == 0) ? n / 2 : n;
    }

    public static void main(String[] args) {
        int[] tests = {1, 2, 3, 4, 6};
        for (int n : tests) {
            System.out.println("n = " + n + " -> Minimum cuts: " + numberOfCuts(n));
        }
    }
}