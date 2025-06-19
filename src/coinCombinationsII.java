import java.util.Scanner;

public class coinCombinationsII {
    final static int MOD = 1_000_000_007;

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
        for (int c : coins) {
            for (int i = c; i <= sum; i++) {
                if (i - c >= 0) {
                    dp[i] = (dp[i] + dp[i - c]) % MOD;
                }
            }
        }
        System.out.println(dp[sum]);

        sc.close();
    }
}
