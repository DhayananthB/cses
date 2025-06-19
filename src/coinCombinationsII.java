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
  

        sc.close();
    }
}
