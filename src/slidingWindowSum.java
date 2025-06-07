import java.util.Scanner;

class slidingWindowSum{
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
        for(int i=1;i<n;i++){
            arr[i] = (a* arr[i-1] + b)%c;
        }
        
        long sum = 0;
        for(int i=0;i<k;i++){
            sum+= arr[i];
        }
        long sol = sum;
        int r = k;
        int l = 0;
        while(r<n){
            sum+= arr[r++];
            sum-= arr[l++];
            sol = sol ^ sum;
        }

        System.out.println(sol);
        sc.close();
    }
}