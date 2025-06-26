import java.util.Scanner;

public class repetitions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int sol = 1;
        int n = s.length();
        int curr = 1;
        for (int i = 1; i < n; i++) {
            if (s.charAt(i - 1) != s.charAt(i)) {
                curr = 1;
            } else {
                curr++;
                sol = Math.max(sol, curr);
            }
        }
        System.out.println(sol);
        sc.close();

    }
}
