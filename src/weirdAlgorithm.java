import java.util.Scanner;

public class weirdAlgorithm {
    private static void operation(long n){
        if(n==1){
            System.out.print(n + " ");
            return;
        }
        if(n%2==0){
            System.out.print(n+" ");
            operation(n/2);
        } 
        else{
            System.out.print(n+" ");
            operation(3*n + 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        operation((long)n);
        sc.close();
;    }
}
