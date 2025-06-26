import java.util.Scanner;

public class permutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==3 || n==2) {
            System.out.println("NO SOLUTION");
            sc.close();
            return;
        }
        StringBuilder s = new StringBuilder();

        for(int i = 2;i<=n;i+=2){
            s.append(i);
            s.append(" ");
        }
        for(int i = 1;i<=n;i+=2){
            s.append(i);
            s.append(" ");
        }
        System.out.println(s);
        sc.close();
    }
}
