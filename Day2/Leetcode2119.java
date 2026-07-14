public class Leetcode2119 {
    public static boolean isSameAfterReversals(int num) {
        return num == 0 || num % 10 != 0;
    }

    public static void main(String[] args) {
        int test1 = 526;
        int test2 = 1800;
        int test3 = 0;

        System.out.println("num = " + test1 + " -> " + isSameAfterReversals(test1));
        System.out.println("num = " + test2 + " -> " + isSameAfterReversals(test2));
        System.out.println("num = " + test3 + " -> " + isSameAfterReversals(test3));
    }
}