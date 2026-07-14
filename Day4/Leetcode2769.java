public class Leetcode2769 {
    public static int theMaximumAchievableX(int num, int t) {
        return num + 2 * t;
    }

    public static void main(String[] args) {
        System.out.println("=== LeetCode 2769: Find the Maximum Achievable Number ===");
        System.out.println("num = 4, t = 1 -> Max Achievable: " + theMaximumAchievableX(4, 1));
        System.out.println("num = 3, t = 2 -> Max Achievable: " + theMaximumAchievableX(3, 2));
    }
}