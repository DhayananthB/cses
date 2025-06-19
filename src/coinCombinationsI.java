
// import java.util.Arrays;
import java.util.Scanner;

public class coinCombinationsI {
    final static int MOD = 1_000_000_007;

    public static int recursion(int amount, int[] coins) {
        if (amount == 0)
            return 1;
        if (amount < 0)
            return 0;
        int comb = 0;

        for (int c : coins) {
            comb += recursion(amount - c, coins);
        }

        return comb;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = sc.nextInt();
        int[] coins = new int[n];
        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
        }
        int[] dp = new int[sum + 1];
        dp[0] = 1;
        for (int i = 1; i <= sum; i++) {
            for (int c : coins) {
                if (i - c >= 0) {
                    dp[i] = (dp[i] + dp[i - c]) % MOD;
                }
            }
        }
        // System.out.println(Arrays.toString(dp));
        System.out.println(dp[sum]);
        // System.out.println(recursion(sum, coins));

        sc.close();
    }
}
