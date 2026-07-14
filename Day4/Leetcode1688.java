public class Leetcode1688 {
    public static int numberOfMatches(int n) {
        // Since each match eliminates exactly one team, n teams require n - 1 elimination matches.
        return n - 1;
    }

    public static void main(String[] args) {
        int[] tests = {7, 14, 2};
        System.out.println("=== LeetCode 1688: Count of Matches in Tournament ===");
        for (int n : tests) {
            System.out.println("Teams: " + n + " -> Matches played: " + numberOfMatches(n));
        }
    }
}