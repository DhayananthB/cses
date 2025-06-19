import java.util.Scanner;

public class diceCombinations {
    static final int mod = (int)1e9 + 7;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n+1];
        dp[0] = 1;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=6;j++){
                if(j<=i){
                    dp[i] = (dp[i] + dp[i-j])%mod;
                }
            }
        }
        System.out.println(dp[n]);


        sc.close();

    }
}
