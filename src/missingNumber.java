import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class missingNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        long sum = (long)n*(n+1) / 2;
        for(int i = 0;i<n-1;i++){
            sum-= Integer.parseInt(st.nextToken());
        }
        System.out.println(sum);
    }
}
