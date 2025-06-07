import java.util.Scanner;

public class slidingWindowXor {
    private static long xor(long[] arr, int k) {
        long sol = 0;
        long xr = 0;
        int l = 0;
        for (int i = 0; i < arr.length; i++) {
            xr = xr ^ arr[i];
            if(i >= k-1){
                sol = sol ^ xr;
                xr = xr ^ arr[l];
                l++;
            }
        }
        return sol;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long x = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long[] arr = new long[n];
        arr[0] = x;
        for (int i = 1; i < n; i++) {
            arr[i] = (a * arr[i - 1] + b) % c;
        }

        System.out.println(xor(arr, k));
        sc.close();

    }

}
