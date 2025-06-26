import java.util.Scanner;

public class increasingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] nums = new long[n];
        for(int i = 0 ; i < n ; i++){
            nums[i] = sc.nextInt();
        }
        long sol = 0;
        for(int i = 1;i<n;i++){
            if(nums[i-1] > nums[i]){
                sol+= nums[i-1]-nums[i];
                nums[i]+= (nums[i-1]-nums[i]);
            }
        }
        System.out.println(sol);
        sc.close();
    }
}
