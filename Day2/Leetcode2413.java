public class Leetcode2413 {
    public static int smallestEvenMultiple(int n) {
        return (n % 2 == 0) ? n : n * 2;
    }

    public static void main(String[] args) {
        int[] tests = {5, 6, 10};
        for (int n : tests) {
            System.out.println("n = " + n + " -> Smallest even multiple: " + smallestEvenMultiple(n));
        }
    }
}