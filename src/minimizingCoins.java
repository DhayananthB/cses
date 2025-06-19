import java.util.Arrays;
import java.util.Scanner;

public class minimizingCoins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int amt = sc.nextInt();
        int coins[] = new int[n];
        for(int i=0;i<n;i++){
            coins[i] = sc.nextInt();
        }
        int[] dp = new int[amt+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0] = 0;
        for(int i = 1;i<= amt;i++){
            for(int c : coins){
                if(i-c >= 0 && dp[i-c]!=Integer.MAX_VALUE){
                    dp[i] = Math.min(dp[i], 1 + dp[i-c]);
                }
            }
        }
        if(dp[amt]!=Integer.MAX_VALUE)System.out.println(dp[amt]);
        else System.out.println(-1);
        
        
        sc.close();
    }
}
