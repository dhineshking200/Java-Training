public class Leetcode2806 {
    public static int accountBalanceAfterPurchase(int purchaseAmount) {
        int roundedAmount = ((purchaseAmount + 5) / 10) * 10;
        return 100 - roundedAmount;
    }

    public static void main(String[] args) {
        int[] purchases = {9, 15, 11, 24};
        System.out.println("=== LeetCode 2806: Account Balance After Rounded Purchase ===");
        for (int p : purchases) {
            System.out.println("Purchase Amount: " + p + " -> Remaining Balance: " + accountBalanceAfterPurchase(p));
        }
    }
}