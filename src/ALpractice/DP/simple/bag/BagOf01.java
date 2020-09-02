package ALpractice.DP.simple.bag;

import java.util.Scanner;

public class BagOf01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] w = new int[n+1];
        int[] v = new int[n+1];
        for(int i=1; i<=n;i++){
            w[i]=scanner.nextInt();
        }
        for(int i=1; i<=n;i++){
            v[i]=scanner.nextInt();
        }
        int[][] dp = new int[n+1][m+1];
        for (int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                int valueWith_i = (j-w[i]>=0)?(v[i]+dp[i-1][j-w[i]]):dp[i-1][j];
                int valueWithout_i = dp[i-1][j];
                dp[i][j] = Math.max(valueWith_i,valueWithout_i);
            }
        }
        System.out.println(dp[n][m]);
    }
}
