import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class slidingWindowMinimum {
    private static long xorMin(long[] arr, int k) {
        long xor = 0;
        Deque<Integer> dq = new ArrayDeque<>();
        for (int i = 0; i < arr.length; i++) {
            while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }
            while (!dq.isEmpty() && arr[dq.peekLast()] >= arr[i]) {
                dq.pollLast();
            }

            dq.add(i);

            if (i >= k - 1) {
                xor = xor ^ arr[dq.getFirst()];
            }

        }

        return xor;
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

        System.out.println(xorMin(arr, k));
        sc.close();

    }

}
